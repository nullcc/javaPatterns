package patterns.command;

public class FunACommand extends Command {
    @Override
    public void execute() {
        this.programer.writeCode();
    }
}
