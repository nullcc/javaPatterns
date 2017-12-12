package patterns.command;

public class FunBCommand extends Command{
    @Override
    public void execute() {
        this.productManager.makeRequirements();
        this.designer.design();
        this.programer.writeCode();
    }
}
