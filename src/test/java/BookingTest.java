import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(34, RoomType.DOUBLE, 150.00);
        booking = new Booking(bedroom, 7);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNightsBooked() {
        assertEquals(7, booking.getNightsBooked());
    }

    @Test
    public void hasTotalBill() {
        assertEquals(1050.00, booking.calculateTotalBill(), 0.0);
    }
}
