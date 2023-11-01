package repository.entity;

// Класс Manager
public class Manager extends BaseEmployee {
    private double baseSalary;
    private int numberOfProjects;

    public Manager(String name, double baseSalary, int numberOfProjects, int hireYear) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfProjects * 1000);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append(", numberOfProjects=").append(numberOfProjects);
        sb.append('}');
        return super.toString() + sb;
    }
}
