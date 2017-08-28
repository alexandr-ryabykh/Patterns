package behavioral.memento;

import java.util.Date;

class Save {
    private final String version;
    private final Date date;

    Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    String getVersion() {
        return version;
    }

    Date getDate() {
        return date;
    }
}
