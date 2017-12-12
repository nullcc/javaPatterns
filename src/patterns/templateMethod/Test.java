package patterns.templateMethod;

public class Test {
    public static void main(String[] args) {
        AppleComputer appleComputer = new AppleComputer();
        DellComputer dellComputer = new DellComputer();

        appleComputer.run();
        System.out.println("\n");
        dellComputer.run();
    }
}
