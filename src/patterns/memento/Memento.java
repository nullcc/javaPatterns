package patterns.memento;

public class Memento {
    private int hp;

    public Memento(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
