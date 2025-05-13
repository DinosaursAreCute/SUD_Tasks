// Abstract base class for all vehicles. Handles tank, speed, engine state, and GPS position.
package Vehicels;

import Employees.Driver;

public abstract class Vehicle {
    protected double tankSize;
    protected double tankLevel;
    protected double currentSpeed;
    protected double maxSpeed;
    protected boolean engineOn;
    protected GPSPosition position;
    protected Driver driver;

    public Vehicle(double tankSize, double maxSpeed, GPSPosition position) {
        this.tankSize = tankSize;
        this.tankLevel = 0;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.engineOn = false;
        this.position = position;
        this.driver = null;
    }

    public void refuel(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot refuel negative amount");
        double overflow = (tankLevel + amount) - tankSize;
        if (overflow > 0) {
            tankLevel = tankSize;
            // return overflow if needed
        } else {
            tankLevel += amount;
        }
    }
    public void startEngine() { engineOn = true; }
    public void stopEngine() { engineOn = false; currentSpeed = 0; }
    public void accelerate(double speed) {
        if (!engineOn) throw new IllegalStateException("Engine must be on");
        currentSpeed = Math.min(currentSpeed + speed, maxSpeed);
    }
    public void brake(double speed) {
        currentSpeed = Math.max(currentSpeed - speed, 0);
    }
    public void drive(double kilometers, GPSPosition newPosition) {
        if (!engineOn) throw new IllegalStateException("Engine must be on");
        if (tankLevel <= 0) throw new IllegalStateException("Tank is empty");
        // Simple consumption model: 1L per 10km
        double needed = kilometers / 10.0;
        if (tankLevel < needed) throw new IllegalStateException("Not enough fuel");
        tankLevel -= needed;
        position = newPosition;
    }
    public void setDriver(Driver driver) { this.driver = driver; }
    public Driver getDriver() { return driver; }
    public GPSPosition getPosition() { return position; }
    public String getInfo() {
        return "Tank: " + tankLevel + "/" + tankSize + ", Speed: " + currentSpeed + "/" + maxSpeed + ", Engine: " + (engineOn ? "On" : "Off");
    }
}
