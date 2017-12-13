package patterns.decorator;

public abstract class Decorator extends Handler {
    private Handler handler;

    public Decorator(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle() {
        this.handler.handle();
    }
}
