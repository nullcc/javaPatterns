package patterns.bridge;

public class Radio implements IElectronicProduct {
    @Override
    public void beProduced() {
        System.out.println("Radio be produced.");
    }

    @Override
    public void beUsed() {
        System.out.println("Radio be used.");
    }
}
