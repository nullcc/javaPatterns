package patterns.facade;

public class Context {
    private Consulate consulate = new Consulate();
    private AirlineCompany airlineCompany = new AirlineCompany();
    private Hotel hotel = new Hotel();

    public void travelAbroad() {
        System.out.println("------ travel abroad start ------");
        this.consulate.getTravelVisa();
        this.airlineCompany.bookingAirlineTickets();
        this.hotel.bookingRoom();
        System.out.println("------ travel abroad end ------");
    }
}
