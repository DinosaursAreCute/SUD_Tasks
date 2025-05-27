//department with a name, a list of employees, and a manager as head.
package Employees;

public class Department {
    //TODO: add a list of employees and a manager as head
    private String name;
    private Employee[] employees = new Employee[0];
    private Manager head;

    Department(String name, Employee[] employees, Manager head) {
        setEmployees(employees);
        setHead(head);
        setName(name);
                                        //  hallooo
        // bboabvebabeboboo
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Manager getHead() {
        return head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setHead(Manager head) {
        this.head = head;
    }
    public Manager switchHead(Manager newHead){
        Manager oldHead = head;
        setHead(newHead);
        return oldHead;
    }

    public void addEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        newEmployees[employees.length] = employee;
        employees = newEmployees;

    }
    public void removeEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[employees.length - 1];
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != employee) {
                newEmployees[i] = employees[i];
            }
        }
        employees = newEmployees;
    }
    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        totalSalary += head.getSalary();
        return totalSalary;
    }
}
