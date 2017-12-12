package patterns.builder;

import java.util.ArrayList;

public abstract class RobotBuilder {
    public abstract void setActionSequence(ArrayList<String> actionSequence);

    public abstract Robot getRobot();
}
