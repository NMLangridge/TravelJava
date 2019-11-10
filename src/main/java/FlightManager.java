import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Passenger> passengers;
    private ArrayList<Plane> planes;

    public FlightManager() {
        this.passengers = new ArrayList<Passenger>();
        this.planes = new ArrayList<Plane>();
    }

    public int reservedBaggageWeightPerPassenger(Plane plane) {
        return plane.getTotalWeightFromEnum() * passengers.size();
    }

}
