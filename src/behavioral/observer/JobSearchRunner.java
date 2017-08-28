package behavioral.observer;

public class JobSearchRunner {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Alex Ryabykh");
        Observer secondSubscriber = new Subscriber("Ivan Ivanov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");

        jobSite.removeObserver(secondSubscriber);
        jobSite.removeVacancy("Third Java Position");
    }
}
