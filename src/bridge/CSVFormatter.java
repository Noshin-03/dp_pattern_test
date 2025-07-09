package bridge;

public class CSVFormatter implements Formatter {
    @Override
    public String format(String title, String content) {
        return "CSV_REPORT\n\"" + title + "\",\"" + content.replace("\n", "\",\"") + "\"";
    }
}
