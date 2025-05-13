// Manages all employees, departments, and provides salary lists and management functions.
package Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> allEmployees = new ArrayList<>();
    private List<ShiftWorker> shiftWorkers = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();

    public void addEmployee(Employee e) {
        allEmployees.add(e);
        if (e instanceof ShiftWorker) shiftWorkers.add((ShiftWorker) e);
    }
    public boolean removeEmployee(Employee e) {
        shiftWorkers.remove(e);
        return allEmployees.remove(e);
    }
    public void addDepartment(Department d) { departments.add(d); }
    public boolean removeDepartment(Department d) { return departments.remove(d); }
    public String getSalaryList() {
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for (Employee e : allEmployees) {
            sb.append(e.getName()).append(": ").append(e.getSalary()).append("\n");
            total += e.getSalary();
        }
        sb.append("Total: ").append(total);
        return sb.toString();
    }
    public void workDay() {
        for (ShiftWorker s : shiftWorkers) s.work();
    }
}
