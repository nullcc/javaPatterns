package patterns.abstractFactory;

public class Test {
    public static void main(String[] args) {
        ComputerFactory desktopFactory = new DesktopFactory();
        ComputerFactory notebookFactory = new NotebookFactory();

        AppleComputer appleDesktop = desktopFactory.createAppleComputer();
        AppleComputer appleNotebook = notebookFactory.createAppleComputer();

        DellComputer dellDesktop = desktopFactory.createDellComputer();
        DellComputer dellNotebook = notebookFactory.createDellComputer();

        appleDesktop.run();
        appleNotebook.run();
        dellDesktop.run();
        dellNotebook.run();
    }
}
