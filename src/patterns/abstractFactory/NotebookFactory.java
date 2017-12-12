package patterns.abstractFactory;

public class NotebookFactory extends ComputerFactory {
    @Override
    public AppleComputer createAppleComputer() {
        return new AppleNotebook();
    }

    @Override
    public DellComputer createDellComputer() {
        return new DellNotebook();
    }
}
