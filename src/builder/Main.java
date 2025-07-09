package builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder combatBuilder = new CombatRobotBuilder();
        RobotDirector director1 = new RobotDirector(combatBuilder);
        director1.constructRobot();
        Robot combatRobot = director1.getRobot();
        System.out.println("Combat Robot: " + combatRobot);

        RobotBuilder cleaningBuilder = new CleaningRobotBuilder();
        RobotDirector director2 = new RobotDirector(cleaningBuilder);
        director2.constructRobot();
        Robot cleaningRobot = director2.getRobot();
        System.out.println("Cleaning Robot: " + cleaningRobot);
    }
}
