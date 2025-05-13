// Represents a bus, a passenger vehicle that requires a driver with license D.
package Vehicels;

import Employees.Driver;
import Employees.DriverLicense;

public class Bus extends PassengerVehicle {
    private String driverName;

    public Bus(double tankSize, double maxSpeed, GPSPosition position, int seatCount, String driverName) {
        super(tankSize, maxSpeed, position, seatCount);
        this.driverName = driverName;
    }
    @Override
    public void setDriver(Driver driver) {
        if (driver.getLicense() != DriverLicense.D) throw new IllegalArgumentException("Bus driver must have license D");
        super.setDriver(driver);
    }
    public String getDriverName() { return driverName; }
}
