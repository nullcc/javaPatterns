package patterns.builder;

import java.util.ArrayList;

public class RobotBBuilder extends RobotBuilder {
    private RobotB robotB = new RobotB();

    public void setActionSequence(ArrayList<String> actionSequence) {
        this.robotB.setActionSequence(actionSequence);
    }

    public Robot getRobot() {
        return this.robotB;
    }
}
