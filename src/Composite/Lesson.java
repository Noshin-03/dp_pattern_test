package Composite;

import java.util.ArrayList;
import java.util.List;

public class Lesson implements LearningComponent {
    private String name;
    private List<Quiz> quizzes = new ArrayList<>();

    public Lesson(String name) {
        this.name = name;
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    @Override
    public int computeDuration() {
        return quizzes.stream().mapToInt(Quiz::computeDuration).sum();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + name);
        for (Quiz quiz : quizzes) {
            quiz.printStructure(indent + "\t");
        }
    }

}
