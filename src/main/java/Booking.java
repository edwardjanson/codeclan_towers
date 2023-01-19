public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;
    private double totalBill;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
        this.totalBill = calculateTotalBill();
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public double calculateTotalBill() {
        return nightsBooked * bedroom.getNightlyRate();
    }
}
