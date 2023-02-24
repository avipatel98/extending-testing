package starter;

public class Defect {

    String name;
    String summary;
    String details;

    public Defect(String name, String summary, String details) {
        this.name = name;
        this.summary = summary;
        this.details = details;
    }

    public Boolean isValid() {
        return nameIsValid() &&
            summaryIsValid() &&
            detailsIsValid();
    }

    private Boolean nameIsValid() {
        return this.name.length() <= 30;
    }

    private Boolean summaryIsValid() {
        return this.summary.length() <= 50;
    }

    private Boolean detailsIsValid() {
        return this.details.length() >= 100 &&
            this.details.length() <= 300;
    }
}