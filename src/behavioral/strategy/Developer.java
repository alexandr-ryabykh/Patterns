package behavioral.strategy;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    void executeActivity() {
        activity.justDoIt();
    }
}
