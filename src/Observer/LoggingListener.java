package Observer;

public class LoggingListener implements EventListener {
    private String logFilePath;

    public LoggingListener(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    @Override
    public void update(String filename) {
        System.out.println("Log entry to : " + logFilePath + ": File " + filename + " has changed.\n");
    }
}
