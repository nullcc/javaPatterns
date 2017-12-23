package patterns.memento;

public class MementoManager {
    private Memento memento;

    public MementoManager(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
