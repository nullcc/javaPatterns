package patterns.abstractFactory;

public class DesktopFactory extends ComputerFactory {
    @Override
    public AppleComputer createAppleComputer() {
        return new AppleDesktop();
    }

    @Override
    public DellComputer createDellComputer() {
        return new DellDesktop();
    }
}
