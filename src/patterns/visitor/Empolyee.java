package patterns.visitor;

public class Empolyee extends Staff {
    private String job;

    public Empolyee(String name, int age, int salary) {
        super(name, age, salary);
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
