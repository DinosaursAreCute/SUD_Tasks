// Represents a manager with a fixed salary and a bonus percentage.
package Employees;

public class Manager extends OfficeWorker {
    private double bonusPercent;

    public Manager(int id, String name, double fixedSalary, double bonusPercent) {
        super(id, name, fixedSalary);
        this.bonusPercent = bonusPercent;
    }

    public double getBonus(double base) { return base * bonusPercent / 100.0; }
    @Override
    public double getSalary() { return super.getSalary() + getBonus(super.getSalary()); }
}
