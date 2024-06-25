package Ozlem_Mext;

public class engineer extends Employee {
    public engineer(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return super.salary * 0.5;
    }
}