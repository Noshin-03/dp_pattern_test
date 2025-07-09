package Composite;

public class Quiz implements LearningComponent {
    private String name;
    private int duration;

    public Quiz(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public int computeDuration() {
        return duration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "\t" + name + " (" + duration + " min)");
    }
}
