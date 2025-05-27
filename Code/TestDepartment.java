package Employees;

import java.util.ArrayList;

public class TestDepartment {
    // Farbige Logging-Methoden
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";
    private static final String RED = "\u001B[31m";

    private static void logInfo(String msg) {
        System.out.println(CYAN + msg + RESET);
    }

    private static void logSuccess(String msg) {
        System.out.println(GREEN + msg + RESET);
    }

    private static void logWarn(String msg) {
        System.out.println(YELLOW + msg + RESET);
    }

    private static void logError(String msg) {
        System.out.println(RED + msg + RESET);
    }

    public static void main(String[] args) {
        // Mitarbeiter anlegen
        Employees.OfficeWorker ow = new OfficeWorker(5001, "alice example", 3000);
        ow.setSalary(3000);
        Employees.ShiftWorker sw = new ShiftWorker(3001, "bob example", 20);
        sw.work(40);
        Employees.Manager m = new Employees.Manager(5002, "eve example", 4000);
        m.setSalary(4000);
        m.setBonus(0.1);

        // Department anlegen
        ArrayList<Employees.Employee> emps = new ArrayList<>();
        emps.add(ow);
        emps.add(sw);
        Employees.Department dep = new Department("IT", emps, m);

        // Methoden testen
        logInfo("Department: " + dep.getName());
        logInfo("Head: " + dep.getHead().getName());
        logInfo("Total Salary: " + dep.getTotalSalary());
        logSuccess("Department toString: " + dep);
        logSuccess("Manager toString: " + m);
        logSuccess("OfficeWorker toString: " + ow);
        logSuccess("ShiftWorker toString: " + sw);

        // Mitarbeiter hinzufügen/entfernen
        Employees.Driver d = new Driver(3002, "carol example", 25, 'C');
        d.work(10);
        dep.addEmployee(d);
        logInfo("Mitarbeiter nach Hinzufügen: " + dep.getEmployees().size());
        logSuccess("Driver toString: " + d);
        dep.removeEmployee(sw);
        logInfo("Mitarbeiter nach Entfernen: " + dep.getEmployees().size());

        // Head wechseln
        Employees.Manager m2 = new Manager(5003, "frank example", 4200);
        m2.setSalary(4200);
        dep.switchHead(m2);
        logInfo("Neuer Head: " + dep.getHead().getName());
        logSuccess("Neuer Head toString: " + m2);

        // Polymorphie-Test
        for (Employee e : dep.getEmployees()) {
            logInfo("Typ: " + e.getClass().getSimpleName() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
            if (e instanceof Driver) {
                logInfo("Driver license: " + ((Driver) e).getLicense());
            }
            logSuccess("toString: " + e);
        }
        logSuccess("Alle Mitarbeiter erfolgreich getestet.");
    }
}
