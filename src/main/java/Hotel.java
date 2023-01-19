import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkInGuest(Guest guest, Bedroom bedroom){
        bedroom.newGuest(guest);
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
    }

    public void bookRoom(Bedroom bedroom, int nightsBooked) {
        Booking booking = new Booking(bedroom, nightsBooked);
        this.bookings.add(booking);
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }
}
