package patterns.visitor;

public class InfoVisitor implements IVisitor{
    private String info = "";
    @Override
    public void visit(Empolyee empolyee) {
        this.info += this.getBasicInfo(empolyee) + " " + this.getEmpolyeeJob(empolyee) + "\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info += this.getBasicInfo(manager) + " " + this.getManagerPerformance(manager) + "\n";
    }

    private String getBasicInfo(Staff staff) {
        return staff.getName() + " " + staff.getAge() + " " + staff.getSalary();
    }

    private String getEmpolyeeJob(Empolyee empolyee) {
        return empolyee.getJob();
    }

    private int getManagerPerformance(Manager manager) {
        return manager.getPerformance();
    }

    public void showStaffInfo() {
        System.out.println(this.info);
    }
}
