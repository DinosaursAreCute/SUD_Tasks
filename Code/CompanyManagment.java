import Employees.Department;
import Employees.Employee;
import Employees.ShiftWorker;
import Vehicles.Vehicle;

public class CompanyManagment {
    private Vehicle[] vehicles;
    private Department [] departments;
    private Employee[] employees;
    private ShiftWorker[] shiftWorkers;


    public void addVehicle(Vehicle vehicle) {
        Vehicle[] newVehicles = new Vehicle[vehicles.length + 1];
        System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
        newVehicles[vehicles.length] = vehicle;
        vehicles = newVehicles;
    }
    public void removeVehicle(Vehicle vehicle) {
        Vehicle[] newVehicles = new Vehicle[vehicles.length - 1];
        int index = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != vehicle) {
                newVehicles[index++] = vehicles[i];
            }
        }
        vehicles = newVehicles;
    }
    public void addDepartment(Department department) {
        Department[] newDepartments = new Department[departments.length + 1];
        System.arraycopy(departments, 0, newDepartments, 0, departments.length);
        newDepartments[departments.length] = department;
        departments = newDepartments;
    }
    public void removeDepartment(Department department) {
        Department[] newDepartments = new Department[departments.length - 1];
        int index = 0;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != department) {
                newDepartments[index++] = departments[i];
            }
        }
        departments = newDepartments;
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
                newEmployees[index++] = employees[i];
            }
        }
        employees = newEmployees;
    }

    public ShiftWorker[] getShiftWorkers() {
        return shiftWorkers;
    }
    public void setShiftWorkers(ShiftWorker[] shiftWorkers) {
        this.shiftWorkers = shiftWorkers;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Department[] getDepartments() {
        return departments;
    }
    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public void workADay(){
        for (int i = 0; i < shiftWorkers.length; i++) {
            shiftWorkers[i].work();
        }
    }
}
