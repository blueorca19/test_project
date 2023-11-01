package repository.entity;

// Класс Salesperson
public class Salesperson extends BaseEmployee {
    private double baseSalary;
    private int numberOfDeals;

    public Salesperson(String name, double baseSalary, int numberOfDeals, int hireYear) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfDeals = numberOfDeals;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfDeals * 200);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salesperson{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append(", numberOfDeals=").append(numberOfDeals);
        sb.append('}');
        return super.toString() + sb;
    }
}
