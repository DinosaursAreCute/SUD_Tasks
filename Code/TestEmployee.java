// Datei: Employees/TestEmployee.java
package Employees;

public class TestEmployee {
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
        // Polymorphie: Employee-Referenz auf Unterklassen
        Employees.Employee e1 = new Employees.OfficeWorker(5001, "alice example", 3000);
        e1.setSalary(3200);
        Employees.Employee e2 = new Employees.ShiftWorker(3001, "bob example", 20);
        ((Employees.ShiftWorker) e2).work(40);
        Driver e3 = new Employees.Driver(3002, "carol example", 25, 'B');
        e3.work(16);



        // Typprüfung und Downcasting
        if (e3 instanceof Employees.Driver) {
            logInfo("Driver license: " + e3.getLicense());
        }

        // Fehlerfälle: ungültige IDs
        try {
            new OfficeWorker(4001, "fail", 1000);
        } catch (IllegalArgumentException ex) {
            logWarn("Korrekt abgefangen (OfficeWorker): " + ex.getMessage());
        }
        try {
            new ShiftWorker(2001, "fail", 10);
        } catch (IllegalArgumentException ex) {
            logWarn("Korrekt abgefangen (ShiftWorker): " + ex.getMessage());
        }
        // Methoden testen
        logSuccess("OfficeWorker: " + e1.getName() + ", Salary: " + e1.getSalary());
        logSuccess("OfficeWorker toString: " + e1);
        logSuccess("ShiftWorker: " + e2.getName() + ", Salary: " + e2.getSalary());
        logSuccess("ShiftWorker toString: " + e2);
        logSuccess("Driver: " + e3.getName() + ", Salary: " + e3.getSalary() + ", License: " + e3.getLicense());
        logSuccess("Driver toString: " + e3);
    }
}

