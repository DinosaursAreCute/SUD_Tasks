//shitf employees but with a license :D
package Employees;

public class Driver extends ShiftWorker {
    private char license;

    public Driver(int id, String name, double hourlyRate, char license) {
        super(id, name, hourlyRate);
        this.license = license;
    }

    
    public void setLicense(char license) { 
        if (license != 'A' && license != 'B' && license != 'C') {
            throw new IllegalArgumentException("Invalid license type. Must be A, B, or C.");
        }
        else  this.license = license;
    }

    public DriverLicense getLicense() { return license; }
}
