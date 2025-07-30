package Observer;

public class Editor {
    public EventManager events;
    private String file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = filePath;
        System.out.println("Opening file: " + filePath);
        events.notify("open", filePath);
    }

    public void saveFile() {
        if (file != null) {
            System.out.println("Saving file: " + file);
            events.notify("save", file);
        } else {
            System.out.println("No file is opened to save.");
        }
    }
}
