package patterns.mediator;

public class Test {
    public static void main(String[] args) {
        AutoDealer autoDealer = new AutoDealer();
        AutoManufacturer autoManufacturer = new AutoManufacturer(autoDealer);
        InsuranceCompany insuranceCompany = new InsuranceCompany(autoDealer);
        Customer customer = new Customer(autoDealer);
        autoDealer.setAutoManufacturer(autoManufacturer);
        autoDealer.setInsuranceCompany(insuranceCompany);
        autoDealer.setCustomer(customer);

        customer.buyCar();
        customer.signInsuranceAgreement();
    }
}
