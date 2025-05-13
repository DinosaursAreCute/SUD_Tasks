// Represents a passenger vehicle with seat management.
package Vehicels;

import Employees.Employee;
import java.util.ArrayList;
import java.util.List;

public class PassengerVehicle extends Vehicle {
    private int seatCount;
    private List<Employee> passengers;

    public PassengerVehicle(double tankSize, double maxSpeed, GPSPosition position, int seatCount) {
        super(tankSize, maxSpeed, position);
        this.seatCount = seatCount;
        this.passengers = new ArrayList<>();
    }
    public boolean boardPassenger(Employee e) {
        if (passengers.size() < seatCount) {
            passengers.add(e);
            return true;
        }
        return false;
    }
    public boolean unboardPassenger(Employee e) {
        return passengers.remove(e);
    }
    public int getPassengerCount() { return passengers.size(); }
}
