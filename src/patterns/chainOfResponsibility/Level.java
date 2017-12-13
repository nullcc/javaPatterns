package patterns.chainOfResponsibility;

public class Level {
    private int level;

    public Level(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Level) {
            Level level = (Level) obj;
            return this.level == level.level;
        }
        return false;
    }
}
