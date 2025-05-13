# SUD_Tasks: Detailed Function Documentation

This document provides a comprehensive overview of all classes and functions in the SUD_Tasks repository. 

---

## Table of Contents
- [Employees Module](#employees-module)
- [Shapes Module](#shapes-module)
- [Vehicels Module](#vehicels-module)
- [Test Classes](#test-classes)
- [General Notes](#general-notes)

---

## Employees Module

### Department.java
- **Department(String name, Manager head)**: Constructor. Creates a department with a name and a manager as head.
- **void addEmployee(Employee e)**: Adds an employee to the department.
- **boolean removeEmployee(Employee e)**: Removes an employee from the department.
- **Manager changeHead(Manager newHead)**: Changes the department head to a new manager.
- **double getTotalIncome()**: Returns the total salary cost for all employees in the department.
- **List<Employee> getEmployees()**: Returns a list of all employees in the department.
- **String getEmployeeList()**: Returns a string listing all employees.

### Driver.java
- **Driver(int id, String name, double hourlyRate, DriverLicense license)**: Constructor. Creates a driver with an ID, name, hourly rate, and license.
- **DriverLicense getLicense()**: Returns the driver's license.

### Employee.java (abstract)
- **Employee(int id, String name)**: Constructor. Creates an employee with an ID and name.
- **int getId()**: Returns the employee's ID.
- **String getName()**: Returns the employee's name.
- **double getSalary()**: Returns the employee's salary (implemented in subclasses).

### EmployeeManagement.java
- **void addEmployee(Employee e)**: Adds an employee to the management system.
- **void addDepartment(Department d)**: Adds a department to the management system.
- **void workDay()**: Simulates a workday for all employees.

### Manager.java
- (Constructor and methods similar to Employee, with bonus handling.)

### OfficeWorker.java
- **OfficeWorker(int id, String name, double fixedSalary)**: Constructor. Creates an office worker.
- **double getSalary()**: Returns the fixed salary.

### ShiftWorker.java
- **void work()**: Increases hours worked by 8.
- **void work(int hours)**: Increases hours worked by a specified amount.

---

## Shapes Module

Each shape class (e.g., Circle, Cone, Cuboid, Cylinder, Rectangle, RegularPrism, RegularPyramid, Sphere) includes:
- Constructors for each shape with relevant parameters (e.g., radius, height).
- Methods for calculating area, volume, and other geometric properties.

---

## Vehicels Module

### Bus.java
- **void setDriver(Driver driver)**: Assigns a driver to the bus.

### FleetManagement.java
- **void addVehicle(Vehicle v)**: Adds a vehicle to the fleet.

### GPSPosition.java
- **void setPosition(double longitude, double latitude)**: Sets the GPS position.

### Truck.java
- **void load(double area)**: Loads cargo.
- **void unload(double area)**: Unloads cargo.
- **void setDriver(Driver driver)**: Assigns a driver to the truck.

---

## Test Classes

All test classes (e.g., TestDepartment.java, TestEmployee.java, TestShapes.java, TestVehicle.java) include:
- **public static void main(String[] args)**: Entry point for running tests and demonstrations of the main modules.

---

## General Notes
- All classes follow standard Java conventions and are organized by topic.
- Abstract classes and interfaces are used for extensibility and code reuse.
- Test classes provide simple demonstrations and can be run directly.

---

If you need more details about a specific class or function, please refer to the source code or request a focused breakdown.
