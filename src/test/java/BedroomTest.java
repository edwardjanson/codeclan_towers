import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Anna Smith");
        bedroom = new Bedroom(50, RoomType.TRIPLE, 150.00);
        bedroom.newGuest(guest);
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, bedroom.getCapacity());
    }

    @Test
    public void hasGuests() {
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(150.00, bedroom.getNightlyRate(), 0.0);
    }

    @Test
    public void canGetSize() {
        assertEquals(25.00, Room.calculateSize(5.00,5.00), 0.0);
    }
}
