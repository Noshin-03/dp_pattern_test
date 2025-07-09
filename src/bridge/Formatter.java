package bridge;

public interface Formatter {
    String format(String title, String content);
    //defines the method that all concrete formatters must implement
}
