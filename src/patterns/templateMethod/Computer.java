package patterns.templateMethod;

public abstract class Computer {
    protected abstract void boot();
    protected abstract void runningProcesses();
    protected abstract void powerOff();
    public final void run() {
        this.boot();
        this.runningProcesses();
        this.powerOff();
    }
}
