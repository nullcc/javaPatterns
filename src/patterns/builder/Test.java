package patterns.builder;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> actionSequence1 = new ArrayList<String>();
        actionSequence1.add("speak");
        actionSequence1.add("think");
        actionSequence1.add("walk");

        ArrayList<String> actionSequence2 = new ArrayList<String>();
        actionSequence1.add("think");
        actionSequence1.add("walk");
        actionSequence1.add("speak");

        RobotBuilder robotABuilder = new RobotABuilder();
        RobotBuilder robotBBuilder = new RobotBBuilder();

        robotABuilder.setActionSequence(actionSequence1);
        robotABuilder.getRobot().demo();

        System.out.println("\n");

        robotABuilder.setActionSequence(actionSequence2);
        robotABuilder.getRobot().demo();

        System.out.println("\n");

        robotBBuilder.setActionSequence(actionSequence1);
        robotBBuilder.getRobot().demo();

        System.out.println("\n");

        robotBBuilder.setActionSequence(actionSequence2);
        robotBBuilder.getRobot().demo();

    }
}
