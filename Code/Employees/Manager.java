package Employees;

public class Manager extends OfficeWorker{
    private double bonus;
    public Manager(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }
    public void setBonus(double bonus) {
        if (bonus < 0 ) throw new IllegalArgumentException("Bonus cannot be negative");
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public double getBonusAmount() {
        return getSalary()*bonus;
    }
}
