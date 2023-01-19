import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("John Smith");
        conferenceRoom = new ConferenceRoom(50, "Ball Room");
        conferenceRoom.newGuest(guest);
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());

    }

    @Test
    public void canGetSize() {
        assertEquals(2500.00, Room.calculateSize(50.00,50.00), 0.0);
    }
}
