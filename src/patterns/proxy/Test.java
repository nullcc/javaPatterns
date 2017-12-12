package patterns.proxy;

public class Test {
    public static void main(String[] args) {
        IStaff engineer = new Engineer();
        IStaff customerServiceStaff = new CustomerServiceStaff(engineer);

        customerServiceStaff.serve();
    }
}
