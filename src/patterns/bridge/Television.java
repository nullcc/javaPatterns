package patterns.bridge;

public class Television implements IElectronicProduct {
    @Override
    public void beProduced() {
        System.out.println("Television be produced.");
    }

    @Override
    public void beUsed() {
        System.out.println("Television be used.");
    }
}
