package patterns.builder;

import java.util.ArrayList;

public class RobotABuilder extends RobotBuilder {
    private RobotA robotA = new RobotA();

    public void setActionSequence(ArrayList<String> actionSequence) {
        this.robotA.setActionSequence(actionSequence);
    }

    public Robot getRobot() {
        return this.robotA;
    }
}
