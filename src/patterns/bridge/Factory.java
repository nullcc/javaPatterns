package patterns.bridge;

public abstract class Factory {
    IElectronicProduct electronicProduct;

    public Factory(IElectronicProduct electronicProduct) {
        this.electronicProduct = electronicProduct;
    }

    public void produce() {
        this.electronicProduct.beProduced();
    }

    public IElectronicProduct getElectronicProduct() {
        return this.electronicProduct;
    }
}
