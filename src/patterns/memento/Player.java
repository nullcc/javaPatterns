package patterns.memento;

public class Player {
    private int hp;

    public Player(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Memento createMemento() {
        return new Memento(this.hp);
    }

    public void restoreMemento(Memento memento) {
        this.hp = memento.getHp();
    }
}
