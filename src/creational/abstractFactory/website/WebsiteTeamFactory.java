package creational.abstractFactory.website;


import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;
import creational.abstractFactory.Developer;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new WebsitePM();
    }
}
