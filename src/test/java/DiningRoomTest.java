import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("John Smith");
        diningRoom = new DiningRoom(10, "The Eatery");
        diningRoom.newGuest(guest);
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, diningRoom.getCapacity());
    }

    @Test
    public void canGetSize() {
        assertEquals(100.00, Room.calculateSize(10.00,10.00), 0.0);
    }
}