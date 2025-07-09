package prototype;

public class ReportTemplate implements Document {
    public String title;
    public String content;

    public ReportTemplate(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ReportTemplate(ReportTemplate original) {
        this.title = original.title;
        this.content = original.content;
    }

    @Override
    public ReportTemplate clone() {
        return new ReportTemplate(this);
    }

    @Override
    public void printDocument() {
        System.out.println("Title: " + title + "\nContent: " + content);
    }
}
