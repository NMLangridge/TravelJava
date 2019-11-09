import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Flight flight3;
    Passenger passenger1;
    Plane plane1;

    @Before
    public void before() {
        flight1 = new Flight("FN123", "STN", "GLA", "09:00");
        flight2 = new Flight("FN456", "YYZ", "EDI", "12:00");
        flight3 = new Flight("FN789", "SXF", "LGW", "18:00");
        passenger1 = new Passenger("Samuel", 2);
        plane1 = new Plane(PlaneType.AIRBUSA340);
    }

    @Test
    public void flightStartsEmpty() {
        assertEquals(0, flight1.getPassengers().size());
    }

    @Test
    public void flightCanAddPassenger() {
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test
    public void flightHasAssignedPlane() {
        flight2.addPlane(plane1);
        assertEquals(1, flight2.getPlanes().size());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("FN123", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("YYZ", flight2.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("LGW", flight3.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("09:00", flight1.getDepartureTime());
    }

}
