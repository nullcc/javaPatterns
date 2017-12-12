package patterns.strategy;

public class Test {
    public static void main(String[] args) {
        IStrategy strategy1 = new Strategy1();
        IStrategy strategy2 = new Strategy2();

        Context context = new Context();
        context.setStrategy(strategy1);
        context.work();

        context.setStrategy(strategy2);
        context.work();
    }
}