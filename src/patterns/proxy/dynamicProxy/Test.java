package patterns.proxy.dynamicProxy;
import java.lang.reflect.InvocationHandler;

public class Test {
    public static void main(String[] args) {
        IMachine machine = new MachineA();
        InvocationHandler handler = new MyInvocationHandler(machine);

        IMachine proxy = DynamicProxy.newProxyInstance(machine.getClass().getClassLoader(), machine.getClass().getInterfaces(), handler);
        proxy.work();
    }
}
