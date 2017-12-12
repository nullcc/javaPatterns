package patterns.mediator;

public class Customer {
    private AutoDealer autoDealer;

    public Customer(AutoDealer autoDealer) {
        this.autoDealer = autoDealer;
    }

    public void payForInsurance() {
        System.out.println("Customer pay for insurance.");
    }

    public void payForCar() {
        System.out.println("Customer pay for car.");
    }

    // 签订保险协议
    public void signInsuranceAgreement() {
        this.autoDealer.signInsuranceAgreement();
    }

    // 购买汽车
    public void buyCar() {
        this.autoDealer.buyCar();
    }
}
