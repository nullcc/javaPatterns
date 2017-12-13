package patterns.decorator;

public class LogDecorator extends Decorator {
    public LogDecorator(Handler handler) {
        super(handler);
    }

    private void log() {
        System.out.println("LogDecorator log.");
    }

    public void handle() {
        super.handle();
        this.log();
    }
}
