package visitor;

public class VisitorPattern {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(4.0, 5.0);
        Rectangle rectangle = new Rectangle(6.0, 2.0);

        AreaCalculatorVisitor areaCalculator = new AreaCalculatorVisitor();
        VolumeCalculatorVisitor volumeCalculator = new VolumeCalculatorVisitor();

        System.out.println("Area : ");
        circle.accept(areaCalculator);

        System.out.println("Volume :");
        circle.accept(volumeCalculator);
        rectangle.accept(volumeCalculator);

    }
}
