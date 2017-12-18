package patterns.facade;

public class TravelAgency {
    private Context context = new Context();

    public void travelAbroad() {
        this.context.travelAbroad();
    }
}
