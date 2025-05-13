public class TestEmployee {
    public static void main(String[] args) {
        // Test ShiftWorker
        ShiftWorker sw = new ShiftWorker(3001, "John Doe", 20.0);
        sw.work();
        sw.work(4);
        System.out.println("ShiftWorker: " + sw.getName() + ", Hours: " + sw.getHoursWorked() + ", Salary: " + sw.getSalary());

        // Test OfficeWorker
        OfficeWorker ow = new OfficeWorker(5001, "Jane Smith", 3000.0);
        System.out.println("OfficeWorker: " + ow.getName() + ", Salary: " + ow.getSalary());

        // Test Manager
        Manager m = new Manager(5002, "Alice Boss", 4000.0, 10.0);
        System.out.println("Manager: " + m.getName() + ", Salary: " + m.getSalary() + ", Bonus: " + m.getBonus(m.getSalary()));

        // Test Driver
        Driver d = new Driver(3002, "Bob Driver", 22.0, DriverLicense.B);
        System.out.println("Driver: " + d.getName() + ", License: " + d.getLicense());
    }
}
