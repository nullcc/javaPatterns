package patterns.proxy;

public class CustomerServiceStaff implements IStaff {
    private IStaff staff = null;

    public CustomerServiceStaff(IStaff _staff) {
        this.staff = _staff;
    }

    @Override
    public void serve() {
        this.answerThePhone();
        this.staff.serve();
        this.recordTheEvent();
    }

    private void answerThePhone() {
        System.out.println("Answer the phone...");
    }

    private void recordTheEvent() {
        System.out.println("Record the event...");
    }
}
