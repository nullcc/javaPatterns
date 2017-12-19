package patterns.bridge;

public class ElectronicProductFactory extends Factory {
    public ElectronicProductFactory(IElectronicProduct electronicProduct) {
        super(electronicProduct);
    }

    @Override
    public void produce() {
        super.produce();
        super.getElectronicProduct().beUsed();
    }
}
