package Composite;

import java.util.ArrayList;
import java.util.List;

public class Course implements LearningComponent {
    private String name;
    private List<LearningComponent> components = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addComponent(LearningComponent component) {
        components.add(component);
    }

    @Override
    public int computeDuration() {
        return components.stream().mapToInt(LearningComponent::computeDuration).sum();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println("Course:  " + name);
        for (LearningComponent component : components) {
            component.printStructure("\t");
        }
    }
}
