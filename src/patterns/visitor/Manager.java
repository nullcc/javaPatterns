package patterns.visitor;

import java.util.ArrayList;

public class Manager extends Staff {
    private int performance;

    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    public int getPerformance() {
        return this.performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
