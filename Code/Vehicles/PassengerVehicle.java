// Represents a passenger vehicle with seat management.
package Vehicles;

import Employees.Employee;
import java.util.ArrayList;
import java.util.List;

public class PassengerVehicle extends Vehicle {
    private int seatCount;
    private List<Employee> passengers;

    public PassengerVehicle(double tankSize, double maxSpeed, Vehicels.GPSPosition position, int seatCount) {
        super(tankSize, maxSpeed, position);
        setSeatCount(seatCount);
        setPassengers(new ArrayList<>());
    }

    public void setSeatCount(int seatCount) {
        if (seatCount <= 0) throw new IllegalArgumentException("Seat count must be positive");
        this.seatCount = seatCount;
    }

    public void setPassengers(List<Employee> passengers) {
        if (passengers == null) throw new IllegalArgumentException("Passengers list cannot be null");
        this.passengers = passengers;
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
