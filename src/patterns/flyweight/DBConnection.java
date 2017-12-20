package patterns.flyweight;

public class DBConnection {
    private int id;

    public DBConnection(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
