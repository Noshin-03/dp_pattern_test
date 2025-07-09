package Composite;

import java.util.ArrayList;
import java.util.List;

public class Project implements LearningComponent {
    private String name;
    private List<Lesson> lessons = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    @Override
    public int computeDuration() {
        return lessons.stream().mapToInt(Lesson::computeDuration).sum();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + name);
        for (Lesson lesson : lessons) {
            lesson.printStructure(indent + "\t");
        }
    }
}

