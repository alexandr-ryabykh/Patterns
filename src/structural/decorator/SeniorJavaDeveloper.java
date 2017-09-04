package structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeCodeReview() {
        return "Making Code Review, ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
