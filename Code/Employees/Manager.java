//manager with a fixed salary and a bonus percentage.
package Employees;

public class Manager extends OfficeWorker {
    private double bonusPercent;

    public Manager(int id, String name, double fixedSalary, double bonusPercent) {
        super(id, name, fixedSalary);
        this.bonusPercent = bonusPercent;
    }

    public double getBonus(double base) { return base * bonusPercent / 100.0; }

    @Override
    public double getSalary() { return super.getSalary() + getBonus(super.getSalary()); }

    public double getBonusPercent() { return bonusPercent; }

    public void setBonusPercent(double bonusPercent) { 
        if(bonusPercent > 100) throw new IllegalArgumentException("Bonus percent cannot be greater than 100%"); 
        else if(bonusPercent < 0) throw new IllegalArgumentException("Bonus percent cannot be negative");
        else this.bonusPercent = bonusPercent; }  
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
