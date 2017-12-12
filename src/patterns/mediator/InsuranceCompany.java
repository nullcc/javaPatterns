package patterns.mediator;

public class InsuranceCompany {
    private AutoDealer autoDealer;

    public InsuranceCompany(AutoDealer autoDealer) {
        this.autoDealer = autoDealer;
    }

    // 起草保险协议
    public void draftInsuranceAgreement() {
        System.out.println("Insurance company draft an insurance agreement.");
    }
}
