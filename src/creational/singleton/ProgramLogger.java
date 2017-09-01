package creational.singleton;

class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is log file. \n\n";

    static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    void addLogInfo(String logInfo) {
        logfile += logInfo + "\n";
    }

    void showFile() {
        System.out.println(logfile);
    }
}
