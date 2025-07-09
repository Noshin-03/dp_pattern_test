package builder;

public class CombatRobotBuilder implements RobotBuilder {
    private Robot robot;

    public CombatRobotBuilder() {

        this.robot = new Robot();
    }

    public void buildHead() {

        robot.setHead("Combat Helmet");
    }

    public void buildBody() {

        robot.setBody("Armored Body");
    }

    public void buildArms() {

        robot.setArms("Weaponized Arms");
    }

    public void buildLegs() {

        robot.setLegs("Tank Tracks");
    }

    public Robot getRobot() {

        return robot;
    }
}
