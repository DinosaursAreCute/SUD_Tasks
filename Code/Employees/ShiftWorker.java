//shift worker, paid by hours worked and hourly rate. Only valid IDs start with 3.
package Employees;

public class ShiftWorker extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public ShiftWorker(int id, String name, double hourlyRate) {
        super(id, name);
        
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void work() { hoursWorked += 8; }

    public void work(int hours) { hoursWorked += hours; }

    public int getHoursWorked() { return hoursWorked; }

    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourlyRate() { return hourlyRate; }

    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public double getSalary() { return hoursWorked * hourlyRate; }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setId(int id) {
        if (String.valueOf(id).charAt(0) != '3') {
            throw new IllegalArgumentException("ShiftWorker ID must start with 3");
        }
        super.setId(id);
    }
}
