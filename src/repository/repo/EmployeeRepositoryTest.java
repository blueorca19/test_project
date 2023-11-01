package repository.repo;

import repository.entity.BaseEmployee;
import repository.entity.Developer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.entity.Salesperson;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Andrej Reutow
 * created on 18.10.2023
 */
class EmployeeRepositoryTest {

    private EmployeeRepository repository;

    @BeforeAll
    public static void init() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("@BeforeEach");
        repository = new EmployeeRepository();
    }

    @Test
    void test_countEmployees() {

        int result = repository.countEmployees();

        Assertions.assertEquals(0, result);
    }

    @Test
    void test_addEmployee_() {
        //Дано
        try {
            repository.addEmployee(null);
            fail("RuntimeException no exception");
        } catch (RuntimeException e) {

        }

    }


    /*Дано
        assertFalse(repository.addEmployee(null));
        BaseEmployee developer = new Developer("John", 2000, 40, 2023);
        assertFalse(repository.addEmployee(developer));
        BaseEmployee salesperson = new Salesperson("Jak", 2600, 100, 2002);
        assertTrue(repository.addEmployee(salesperson));
        assertEquals(5, repository.quantity());
    }*/


    @Test
    void test_removeEmployee_() {
        //Дано
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2023);
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2023);
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2023);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.addEmployee(developer3);
        assertTrue(repository.removeEmployee(developer2.getId()));

        BaseEmployee[] employees = repository.getAll()
                ;
        Assertions.assertEquals(2, repository.countEmployees());
        Assertions.assertEquals(developer1.getName(), employees[0].getName());
        Assertions.assertEquals(developer3.getName(), employees[1].getName());
        assertNull(employees[2]);

        // Когда

        // Тогда
        Assertions.assertEquals(2, repository.countEmployees());

        Assertions.assertEquals(developer1.getName(), employees[0].getName());
        Assertions.assertEquals(developer3.getName(), employees[1].getName());
        for (int i = 2; i < employees.length; i++) {
            Assertions.assertNull(employees[i]);
        }
    }
}

