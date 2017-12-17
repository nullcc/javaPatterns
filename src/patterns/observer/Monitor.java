package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Monitor implements Observer {
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        String msg = (String)arg;
        Server server = (Server)o;
        if (msg.equalsIgnoreCase("cpu overload")) {
            System.out.println(this.getName() + " got cpu overload message of " + server.getName() + ".");
        } else if (msg.equalsIgnoreCase("disk overload")) {
            System.out.println(this.getName() + " got disk overload message of " + server.getName() + ".");
        }
    }
}
