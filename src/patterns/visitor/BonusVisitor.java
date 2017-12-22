package patterns.visitor;

public class BonusVisitor implements IVisitor {
    private final static int EMPOLYEE_COEFFICIENT = 2;
    private final static int MANAGER_COEFFICIENT = 4;
    private int totalBonus = 0;

    @Override
    public void visit(Empolyee empolyee) {
        this.totalBonus += empolyee.getSalary() * EMPOLYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        this.totalBonus += manager.getSalary() * MANAGER_COEFFICIENT;
    }

    public void showTotalBonus() {
        System.out.println("所有人的奖金总和是: " + this.totalBonus);
    }
}
