package repository.entity;

// Абстрактный класс BaseEmployee
public abstract class BaseEmployee implements Employee, Comparable<BaseEmployee> {
    private String name;
    private Integer id; // null
    private int hireYear;
    private double salary;

    public BaseEmployee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    @Override
    public int compareTo(BaseEmployee o) {
        return this.getHireYear() - o.getHireYear();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void adjustSalaryByExperience(int minExperience, int maxExperience, double percentage) {
        // todo
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseEmployee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", hireYear=").append(hireYear);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString() + " ";
    }
}
