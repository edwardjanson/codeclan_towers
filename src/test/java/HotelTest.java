import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(67,RoomType.SINGLE, 150.00);
        conferenceRoom = new ConferenceRoom(50,"Ballroom");
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        guest = new Guest("Anthony B.");
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.getBedrooms().size());
    }
    @Test
    public void hadConferenceRooms() {
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(bedroom, 7);
        assertEquals(1, hotel.getBookings().size());
    }

    @Test
    public void canAddDiningRoom() {
        DiningRoom diningRoom = new DiningRoom(10, "The Eatery");
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.getDiningRooms().size());
    }
}
