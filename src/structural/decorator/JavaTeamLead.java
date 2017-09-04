package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    JavaTeamLead(Developer developer) {
        super(developer);
    }

    private String sendWeekReport() {
        return "Sending report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
