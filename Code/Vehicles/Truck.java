// Represents a truck with a loading area. Requires driver with license C.
package Vehicels;

import Employees.Driver;
import Employees.DriverLicense;

public class Truck extends Vehicle {
    private double loadingArea;
    private double loadedArea;

    public Truck(double tankSize, double maxSpeed, GPSPosition position, double loadingArea) {
        super(tankSize, maxSpeed, position);
        this.loadingArea = loadingArea;
        this.loadedArea = 0;
    }
    public void load(double area) {
        if (loadedArea + area > loadingArea) throw new IllegalArgumentException("Exceeds max loading area");
        loadedArea += area;
    }
    public void unload(double area) {
        if (area > loadedArea) throw new IllegalArgumentException("Cannot unload more than loaded");
        loadedArea -= area;
    }
    @Override
    public void setDriver(Driver driver) {
        if (driver.getLicense() != DriverLicense.C) throw new IllegalArgumentException("Truck driver must have license C");
        super.setDriver(driver);
    }
    public double getLoadedArea() { return loadedArea; }
}
