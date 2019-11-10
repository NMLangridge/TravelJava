import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight1;
    Passenger passenger1;
    Plane plane1;

    @Before
    public void before() {
        flight1 = new Flight("FN123", "STN", "GLA", "09:00");
        passenger1 = new Passenger("Jack", 2);
        plane1 = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void reservedBaggageWeightPerPassenger() {
        flight1.addPlane(plane1);
        flight1.addPassenger(passenger1);
        assertEquals(20, flight1.reservedBaggageWeightPerPassenger(plane1));
    }

}
