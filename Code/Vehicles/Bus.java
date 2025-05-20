// Represents a bus, a passenger vehicle that requires a driver with license D.
package Vehicles;

import Employees.Driver;

public class Bus extends PassengerVehicle {
    private String driverName;

    public Bus(double tankSize, double maxSpeed, Vehicels.GPSPosition position, int seatCount, String driverName) {
        super(tankSize, maxSpeed, position, seatCount);
        setDriverName(driverName);
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.getLicense() != 'D') throw new IllegalArgumentException("Bus driver must have license D");
        super.setDriver(driver);
    }

    public void setDriverName(String driverName) {
        if (driverName == null || driverName.isEmpty()) throw new IllegalArgumentException("Driver name cannot be null or empty");
        this.driverName = driverName;
    }

    public String getDriverName() { return driverName; }
}
