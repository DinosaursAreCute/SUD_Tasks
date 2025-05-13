// Represents a department with a name, a list of employees, and a manager as head.
package Employees;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;
    private Manager head;

    public Department(String name, Manager head) {
        this.name = name;
        this.head = head;
        this.employees = new ArrayList<>();
        this.employees.add(head);
    }

    public void addEmployee(Employee e) { employees.add(e); }
    public boolean removeEmployee(Employee e) { return employees.remove(e); }
    public Manager changeHead(Manager newHead) {
        Manager old = this.head;
        this.head = newHead;
        if (!employees.contains(newHead)) employees.add(newHead);
        return old;
    }
    public double getTotalIncome() {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }
    public List<Employee> getEmployees() { return employees; }
    public String getEmployeeList() {
        StringBuilder sb = new StringBuilder();
        for (Employee e : employees) {
            sb.append(e.getName()).append(": ").append(e.getSalary()).append("\n");
        }
        return sb.toString();
    }
}
