package behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    Notifier(int priority) {
        this.priority = priority;
    }

    void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
