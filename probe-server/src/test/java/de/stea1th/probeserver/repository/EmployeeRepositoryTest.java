package de.stea1th.probeserver.repository;

import de.stea1th.probeserver.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findById() {
        String expected = "Peter";

        Employee employee = employeeRepository.findById(1L).orElse(null);

        assertNotNull(employee);
        assertEquals(expected, employee.getFirstName());
    }

    @Test
    void findAll() {
        int expected = 2;

        List<Employee> result = employeeRepository.findAll();

        assertEquals(expected, result.size());
    }
}
