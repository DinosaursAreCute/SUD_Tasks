// Represents an office worker with a fixed salary. Only valid IDs start with 5.
package Employees;

public class OfficeWorker extends Employee {
    private double fixedSalary;

    public OfficeWorker(int id, String name, double fixedSalary) {
        super(id, name);
        if (String.valueOf(id).charAt(0) != '5') throw new IllegalArgumentException("OfficeWorker ID must start with 5");
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getSalary() { return fixedSalary; }
}
