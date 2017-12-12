package patterns.prototype;

public class Minion implements Cloneable {

    private int id;

    public Minion(int id) {
        this.id = id;
    }

    public void sing() {
        System.out.println("Ba-ba-ba, Ba-banana. Ba-ba-ba, Ba-banana～");
    }

    public void eat() {
        System.out.println("Minion eat!");
    }

    public void sleep() {
        System.out.println("Minion sleep!");
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public Minion clone() {
        Minion minion = null;
        try {
            minion = (Minion)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return minion;
    }
}
