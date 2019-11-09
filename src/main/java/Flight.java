import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private ArrayList<Plane> planes;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.planes = new ArrayList<Plane>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

}
