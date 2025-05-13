// Test class for Vehicle and its subclasses
package Test;

import Vehicels.*;
import Employees.*;

public class TestVehicle {
    public static void main(String[] args) {
        GPSPosition pos = new GPSPosition(50.0, 10.0);
        Bus bus = new Bus(200, 120, pos, 50, "Bus Driver");
        Driver driver = new Driver(3004, "Bus Driver", 25.0, DriverLicense.D);
        bus.setDriver(driver);
        bus.startEngine();
        bus.refuel(100);
        bus.drive(20, new GPSPosition(51.0, 11.0));
        System.out.println("Bus Info: " + bus.getInfo());
        System.out.println("Bus Driver: " + bus.getDriverName());

        Truck truck = new Truck(300, 100, pos, 40);
        Driver truckDriver = new Driver(3005, "Truck Driver", 23.0, DriverLicense.C);
        truck.setDriver(truckDriver);
        truck.refuel(150);
        truck.startEngine();
        truck.load(20);
        truck.drive(50, new GPSPosition(52.0, 12.0));
        System.out.println("Truck Info: " + truck.getInfo());
        System.out.println("Loaded Area: " + truck.getLoadedArea());
    }
}
