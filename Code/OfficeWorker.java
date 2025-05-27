//office worker with a fixed salary. Only valid IDs start with 5.
package Employees;

public class OfficeWorker extends Employee {

    private double salary;
    public OfficeWorker(int id, String name, double fixedSalary) {
        super(id, name);
        setId(id);
    }
    @Override
    public double getSalary(){return salary; }
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setId(int id) {
        if (String.valueOf(id).charAt(0) != '5') {
            throw new IllegalArgumentException("OfficeWorker ID must start with 5");
        }
        super.setId(id);
    }

    @Override
    public String toString() {
        return String.format("OfficeWorker{id=%d, name='%s', salary=%.2f}", getId(), getName(), getSalary());
    }

}
