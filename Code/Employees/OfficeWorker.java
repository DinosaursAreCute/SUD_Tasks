//office worker with a fixed salary. Only valid IDs start with 5.
package Employees;

public class OfficeWorker extends Employee {
    private double fixedSalary;

    public OfficeWorker(int id, String name, double fixedSalary) {
        super(id, name);
        setId(id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getSalary() { return fixedSalary; }

    public double getFixedSalary() { return fixedSalary; }

    public void setFixedSalary(double fixedSalary) { this.fixedSalary = fixedSalary; }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setId(int id) {
        if (String.valueOf(id).charAt(0) != '5') {
            throw new IllegalArgumentException("OfficeWorker ID must start with 5"); //Probably smarter to just divide to also directly check if lenght is correct but i wanna annoy miss Rollins
        }
        super.setId(id);
    }
}
