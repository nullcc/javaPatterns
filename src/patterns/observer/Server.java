package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Server extends Observable {
    private String name;

    public Server(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cpuOverload() {
        System.out.println(this.getName() + " CPU overload.");
        super.setChanged();
        super.notifyObservers("cpu overload");
    }

    public void diskOverload() {
        System.out.println(this.getName() + " disk overload.");
        super.setChanged();
        super.notifyObservers("disk overload");
    }
}
