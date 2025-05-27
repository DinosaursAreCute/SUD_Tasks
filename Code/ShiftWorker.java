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

    public void work() {
        hoursWorked += 8;
    }

    public void work(int hours) {
        hoursWorked += hours;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setSalary(double salary) {
        System.err.println("cant do");
    }

    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setId(int id) {
        try {
            if (String.valueOf(id).charAt(0) != '3') {
                throw new IllegalArgumentException("ShiftWorker ID must start with 3");
            } else super.setId(id);
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting ID: " + e.getMessage());
            id = -1; // Set to an invalid ID if the exception occurs
        }
    }

    @Override
    public String toString() {
        return String.format("ShiftWorker{id=%d, name='%s', hoursWorked=%d, hourlyRate=%.2f, salary=%.2f}", getId(), getName(), getHoursWorked(), getHourlyRate(), getSalary());
    }
}