package patterns.chainOfResponsibility;

public class Request {
    private Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return this.level;
    }
}
