package abstract_factory;

// Application.java
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(ThemeFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        ThemeFactory factory;

        // Switch between factories based on configuration
        String theme = "dark"; // or "light"

        if ("dark".equalsIgnoreCase(theme)) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
