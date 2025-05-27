package Employees;

public abstract class Employee {
    protected int id;
    protected String name;


    public Employee(int id, String name) {
        try {
            setName(name);
            setId(id);
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating Employee: " + e.getMessage());
            throw e;
        }
    }

    abstract public void setSalary(double salary);


    public int getId() { return id; }

    public void setId(int id) {
        try {
            if (id < 1000 || id > 9999) throw new IllegalArgumentException("ID must be four digits and positive");
            this.id = id;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting ID: " + e.getMessage());
            id = -1;
        }
    }

    public String getName() { return name; }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
            String[] parts = name.split(" ");
            String capitalizedName = "";
            for (String part : parts) {
                if (!part.isEmpty()) {
                    String capitalizedPart = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                    capitalizedName += capitalizedPart + " ";
                }
            }
            this.name = capitalizedName.trim();
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting name: " + e.getMessage());
            throw e;
        }
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return String.format("%s{id=%d, name='%s'}", this.getClass().getSimpleName(), id, name);
    }
}
