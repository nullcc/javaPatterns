package patterns.mediator;

public class AutoDealer {
    private AutoManufacturer autoManufacturer;
    private InsuranceCompany insuranceCompany;
    private Customer customer;

    public void setAutoManufacturer(AutoManufacturer autoManufacturer) {
        this.autoManufacturer = autoManufacturer;
    }

    public AutoManufacturer getAutoManufacturer() {
        return autoManufacturer;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    // 签订保险协议
    public void signInsuranceAgreement() {
        this.insuranceCompany.draftInsuranceAgreement();
        this.customer.payForInsurance();
    }

    // 购买汽车
    public void buyCar() {
        this.autoManufacturer.produceCar();
        this.customer.payForCar();
    }
}
