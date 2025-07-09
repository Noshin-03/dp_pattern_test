package abstract_factory;

public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox");
    }
}