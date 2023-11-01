package repository.entity;

import java.util.Comparator;

public class BaseEmployeeHireYearComparator implements Comparator<BaseEmployee> {
    @Override
    public int compare(BaseEmployee o1, BaseEmployee o2) {
        return o1.getHireYear() - o2.getHireYear();
    }
}
