package singleton;

public class Logger {

    private static Logger log; 

    private Logger() {
    }

    public static Logger getInstance() {
        if (log == null) {
            synchronized (Logger.class) {
                    log = new Logger();
            }
        }
        return log;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
