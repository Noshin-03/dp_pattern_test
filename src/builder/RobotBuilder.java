package builder;

public interface RobotBuilder {
    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    Robot getRobot();
}
