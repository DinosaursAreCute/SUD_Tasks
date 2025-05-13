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
        setTankSize(tankSize);
        setTankLevel(0);
        setMaxSpeed(maxSpeed);
        setCurrentSpeed(0);
        setEngineOn(false);
        setPosition(position);
        setDriver(null);
    }

    public void setTankSize(double tankSize) {
        if (tankSize <= 0) throw new IllegalArgumentException("Tank size must be positive");
        this.tankSize = tankSize;
    }

    public void setTankLevel(double tankLevel) {
        if (tankLevel < 0 || tankLevel > tankSize) throw new IllegalArgumentException("Tank level must be between 0 and the tank size");
        this.tankLevel = tankLevel;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) throw new IllegalArgumentException("Max speed must be positive");
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        if (currentSpeed < 0 || currentSpeed > maxSpeed) throw new IllegalArgumentException("Current speed must be between 0 and the max speed");
        this.currentSpeed = currentSpeed;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public void setPosition(GPSPosition position) {
        if (position == null) throw new IllegalArgumentException("Position cannot be null");
        this.position = position;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void refuel(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot refuel negative amount");
        double overflow = (tankLevel + amount) - tankSize; //We dont need to do this but as some point i will surely use that value for something
        if (overflow > 0) {
            tankLevel = tankSize;
        } else {
            tankLevel += amount;
        }
    }
    public void startEngine() { engineOn = true; }
    public void stopEngine() { engineOn = false; currentSpeed = 0; }
    public void accelerate(double speed) {
        if (!engineOn) throw new IllegalStateException("Engine must be on");
        currentSpeed = Math.min(currentSpeed + speed, maxSpeed); //this is returns the smaller number. If MaxSpeed is smaller than the set speed, it will return maxSpeed max speed will be applied :D
    }
    public void brake(double speed) {
        currentSpeed = Math.max(currentSpeed - speed, 0); //this is returns the bigger number. If the speed is smaller than 0, it will return 0 so useful so remmeber that one
    }
    public void drive(double kilometers, GPSPosition newPosition) {
        if (!engineOn) throw new IllegalStateException("Engine must be on");
        if (tankLevel <= 0) throw new IllegalStateException("Tank is empty");
        // We did not need it but i wanted to do this so yea this is a simple consumption model: 1L per 10km
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
