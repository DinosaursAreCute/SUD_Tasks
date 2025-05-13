// Manages all vehicles in the fleet.
package Vehicels;

import java.util.ArrayList;
import java.util.List;

public class FleetManagement {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) { vehicles.add(v); }
    public boolean removeVehicle(Vehicle v) { return vehicles.remove(v); }
    public List<Vehicle> getVehicles() { return vehicles; }
}
