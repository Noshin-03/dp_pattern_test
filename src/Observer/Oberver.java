package Observer;

public class Oberver {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new EmailAlertsListener("admin@example.com"));
        editor.events.subscribe("save", new LoggingListener("/log/filelog.txt"));

        editor.openFile("DesignPatterns.java");
        editor.saveFile();
    }
}
