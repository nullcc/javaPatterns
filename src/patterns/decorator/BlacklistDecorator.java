package patterns.decorator;

public class BlacklistDecorator extends Decorator {
    public BlacklistDecorator(Handler handler) {
        super(handler);
    }

    private void filterBlacklist() {
        System.out.println("BlacklistDecorator filter blacklist.");
    }

    public void handle() {
        this.filterBlacklist();
        super.handle();
    }
}
