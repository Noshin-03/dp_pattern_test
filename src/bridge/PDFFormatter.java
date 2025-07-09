package bridge;

public class PDFFormatter implements Formatter {
    @Override
    public String format(String title, String content) {
        return "[PDF Report]\nTitle: " + title + "\nContent:\n" + content + "\n-- PDF Footer --";
    }
}
