package builder;

public class CleaningRobotBuilder implements RobotBuilder {
    private Robot robot;

    public CleaningRobotBuilder() {
        this.robot = new Robot();
    }

    public void buildHead() {
        robot.setHead("Sensor Head");
    }

    public void buildBody() {
        robot.setBody("Lightweight Plastic Body");
    }

    public void buildArms() {
        robot.setArms("Vacuum Arms");
    }

    public void buildLegs() {
        robot.setLegs("Wheeled Legs");
    }

    public Robot getRobot() {
        return robot;
    }
}
