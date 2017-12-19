package patterns.bridge;

public class Test {
    public static void main(String[] args) {
        Factory electronicProductFactory1 = new ElectronicProductFactory(new Radio());
        electronicProductFactory1.produce();

        Factory electronicProductFactory2 = new ElectronicProductFactory(new Television());
        electronicProductFactory2.produce();
    }
}
