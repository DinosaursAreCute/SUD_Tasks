package Employees;

public class Driver extends ShiftWorker {
    private DriverLicense license;

    public Driver(int id, String name, double hourlyRate, DriverLicense license) {
        super(id, name, hourlyRate);
        this.license = license;
    }

    public DriverLicense getLicense() { return license; }
}
