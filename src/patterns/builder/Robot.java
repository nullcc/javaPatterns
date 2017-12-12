package patterns.builder;

import java.util.ArrayList;

public abstract class Robot {
    private ArrayList<String> actionSequence = new ArrayList<String>();

    protected abstract void speak();

    protected abstract void walk();

    protected abstract void think();

    public final void demo() {
        for (int i = 0; i < this.actionSequence.size(); i++) {
            String action = this.actionSequence.get(i);
            if (action.equalsIgnoreCase("speak")) {
                this.speak();
            } else if (action.equalsIgnoreCase("walk")) {
                this.walk();
            } else if (action.equalsIgnoreCase("think")) {
                this.think();
            }
        }
    }

    public final void setActionSequence(ArrayList actionSequence) {
        this.actionSequence = actionSequence;
    }
}
