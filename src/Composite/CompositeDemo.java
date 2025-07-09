package Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Quiz q1 = new Quiz("Quiz 1", 10);
        Quiz q2 = new Quiz("Quiz 2", 15);
        Quiz q3 = new Quiz("Quiz 3", 20);

        Lesson lesson1 = new Lesson("Lesson 1");
        lesson1.addQuiz(q1);
        lesson1.addQuiz(q2);

        Lesson lesson2 = new Lesson("Lesson 2");
        lesson2.addQuiz(q3);

        Project project = new Project("Project");
        project.addLesson(lesson1);
        project.addLesson(lesson2);

        Course course = new Course("Java Course");
        course.addComponent(lesson1);
        course.addComponent(project);

        course.printStructure("");

        System.out.println("\nTotal Duration: " + course.computeDuration() + " minutes");
    }
}
