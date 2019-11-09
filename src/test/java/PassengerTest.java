import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        passenger1 = new Passenger("Faye", 1);
        passenger2 = new Passenger("Niall", 2);
        passenger3 = new Passenger("Chris", 3);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Faye", passenger1.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger2.getNumberOfBags());
    }

}
