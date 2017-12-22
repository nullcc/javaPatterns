package patterns.visitor;

public interface IVisitor {
    public void visit(Empolyee empolyee);
    public void visit(Manager manager);
}