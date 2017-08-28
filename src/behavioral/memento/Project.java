package behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    void setVersion(String version) {
        this.version = version;
        this.date = new Date();
    }

    Save save() {
        return new Save(version);
    }

    void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
