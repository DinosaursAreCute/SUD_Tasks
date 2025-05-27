package CompanyManagement;

import Employees.*;
import Vehicles.*;
import java.util.ArrayList;

public class CompanyManagementTest {
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";
    private static final String RED = "\u001B[31m";

    private static void logInfo(String msg) { System.out.println(CYAN + msg + RESET); }
    private static void logSuccess(String msg) { System.out.println(GREEN + msg + RESET); }
    private static void logWarn(String msg) { System.out.println(YELLOW + msg + RESET); }
    private static void logError(String msg) { System.out.println(RED + msg + RESET); }

    public static void main(String[] args) {
        CompanyManagment cm = new CompanyManagment();
        GPSPosition gps = new GPSPosition(10, 10);
        GPSPosition gps2 = new GPSPosition(20, 20);
        // Fahrzeuge anlegen und testen
        Vehicle v1 = new Vehicles.Truck(100, 120, gps, 2000);
        Vehicle v2 = new Vehicles.Bus(150, 100, gps2, 50);
        cm.addVehicle(v1);
        cm.addVehicle(v2);
        logSuccess("Fahrzeuge hinzugefügt: " + cm.getVehicles());
        cm.removeVehicle(v1);
        logInfo("Fahrzeug entfernt, verbleibend: " + cm.getVehicles());

        // Abteilungen anlegen und testen
        Manager m = new Manager(5001, "Alice Manager", 4000);
        m.setSalary(4000);
        ArrayList<Employee> emps = new ArrayList<>();
        OfficeWorker ow = new OfficeWorker(5002, "Bob Office", 3000);
        emps.add(ow);
        Department dep = new Department("IT", emps, m);
        cm.addDepartment(dep);
        logSuccess("Abteilung hinzugefügt: " + cm.getDepartments());
        cm.remove(dep);
        logInfo("Abteilung entfernt, verbleibend: " + cm.getDepartments());

        // Mitarbeiter anlegen und testen
        ShiftWorker sw = new ShiftWorker(3001, "Charlie Shift", 20);
        cm.add(ow);
        cm.add(sw);
        logSuccess("Mitarbeiter hinzugefügt: " + cm.getEmployees());
        cm.remove(ow);
        logInfo("Mitarbeiter entfernt, verbleibend: " + cm.getEmployees());

        // Schichtarbeiter anlegen und testen
        cm.add(sw);
        logSuccess("Schichtarbeiter hinzugefügt: " + cm.getShiftWorkers());
        cm.remove(sw);
        logInfo("Schichtarbeiter entfernt, verbleibend: " + cm.getShiftWorkers());

        // set-Methoden testen
        ArrayList<Vehicle> newVehicles = new ArrayList<>();
        newVehicles.add(v2);
        cm.setVehicles(newVehicles);
        logInfo("Fahrzeuge gesetzt: " + cm.getVehicles());

        ArrayList<Employee> newEmployees = new ArrayList<>();
        newEmployees.add(ow);
        cm.setEmployees(newEmployees);
        logInfo("Mitarbeiter gesetzt: " + cm.getEmployees());

        ArrayList<Department> newDepartments = new ArrayList<>();
        newDepartments.add(dep);
        cm.setDepartments(newDepartments);
        logInfo("Abteilungen gesetzt: " + cm.getDepartments());

        ArrayList<ShiftWorker> newShiftWorkers = new ArrayList<>();
        newShiftWorkers.add(sw);
        cm.setShiftWorkers(newShiftWorkers);
        logInfo("Schichtarbeiter gesetzt: " + cm.getShiftWorkers());

        // workADay testen
        sw.setHoursWorked(0);
        cm.workADay();
        logSuccess("Nach workADay: Schichtarbeiter Stunden = " + sw.getHoursWorked());

        logSuccess("Alle CompanyManagment-Features erfolgreich getestet.");
    }
}

