package patterns.command;

public abstract class Command {
    protected ProductManager productManager = new ProductManager();
    protected Designer designer = new Designer();
    protected Programer programer = new Programer();
    public abstract void execute();
}
