package patterns.proxy;

public class Engineer implements IStaff {
    @Override
    public void serve() {
        System.out.println("Engineer serve...");
    }
}
