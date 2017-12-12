package patterns.templateMethod;

public class DellComputer extends Computer {
    protected void boot() {
        System.out.println("DellComputer boot...");
    }

    protected void runningProcesses() {
        System.out.println("DellComputer running processes...");
    }

    protected void powerOff() {
        System.out.println("DellComputer power off...");
    }
}
