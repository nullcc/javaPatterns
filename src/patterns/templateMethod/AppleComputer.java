package patterns.templateMethod;

public class AppleComputer extends Computer {
    protected void boot() {
        System.out.println("AppleComputer boot...");
    }

    protected void runningProcesses() {
        System.out.println("AppleComputer running processes...");
    }

    protected void powerOff() {
        System.out.println("AppleComputer power off...");
    }
}
