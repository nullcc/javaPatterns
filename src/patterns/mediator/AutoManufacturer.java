package patterns.mediator;

public class AutoManufacturer {
    private AutoDealer autoDealer;

    public AutoManufacturer(AutoDealer autoDealer) {
        this.autoDealer = autoDealer;
    }

    // 生产汽车
    public void produceCar() {
        System.out.println("Auto manufacturer produce car.");
    }
}
