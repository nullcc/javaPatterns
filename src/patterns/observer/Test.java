package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Server server1 = new Server("Server_1");
        Monitor monitor1 = new Monitor("Monitor_1");
        Monitor monitor2 = new Monitor("Monitor_2");

        server1.addObserver(monitor1);
        server1.addObserver(monitor2);
        server1.cpuOverload();
        server1.diskOverload();
    }
}
