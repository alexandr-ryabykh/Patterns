package behavioral.state;

class Developer {
    private Activity activity;

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    void justDoIt() {
        activity.justDoIt();
    }
}
