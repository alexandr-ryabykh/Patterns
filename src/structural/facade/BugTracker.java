package structural.facade;

public class BugTracker {
    private boolean activeSprint;

    boolean isActiveSprint() {
        return activeSprint;
    }

    void startSprint() {
        System.out.println("Starting sprint");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Finishing sprint");
        activeSprint = false;
    }
}
