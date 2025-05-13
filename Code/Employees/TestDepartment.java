// Test class for Department
package Employees;

public class TestDepartment {
    public static void main(String[] args) {
        Manager manager = new Manager(5003, "Dept Head", 5000.0, 15.0);
        Department dept = new Department("IT", manager);
        ShiftWorker sw = new ShiftWorker(3003, "Shift Guy", 18.0);
        OfficeWorker ow = new OfficeWorker(5004, "Office Lady", 3200.0);
        dept.addEmployee(sw);
        dept.addEmployee(ow);
        System.out.println("Department: " + dept.getEmployeeList());
        System.out.println("Total Income: " + dept.getTotalIncome());
        Manager newHead = new Manager(5005, "New Head", 5200.0, 12.0);
        dept.changeHead(newHead);
        System.out.println("New Head: " + newHead.getName());
    }
}
