package Employees;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        if (id < 1000 || id > 9999) throw new IllegalArgumentException("ID must be four digits and positive");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public abstract double getSalary();
}
