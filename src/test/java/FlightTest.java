import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Flight flight3;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane1;
    Plane plane2;

    @Before
    public void before() {
        flight1 = new Flight("FN123", "STN", "GLA", "09:00");
        flight2 = new Flight("FN456", "YYZ", "EDI", "12:00");
        flight3 = new Flight("FN789", "SXF", "LGW", "18:00");
        passenger1 = new Passenger("Jack", 2);
        passenger2 = new Passenger("Jill",2);
        plane1 = new Plane(PlaneType.AIRBUSA340);
        plane2 = new Plane(PlaneType.AIRBUSA300);
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

    @Test
    public void getAvailableSeats() {
        flight1.addPlane(plane1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(28, flight1.getAvailableSeats(plane1));
    }

    @Test
    public void bookPassengerIfSeatsAvailable() {
        flight1.bookPassengerIfSeatsAvailable(plane2, passenger1);
        assertEquals(0, flight1.getPassengers().size());
    }

}
