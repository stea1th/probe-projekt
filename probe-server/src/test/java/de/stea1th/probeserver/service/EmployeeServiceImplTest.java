package de.stea1th.probeserver.service;

import de.stea1th.probeserver.entity.Employee;
import de.stea1th.probeserver.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Spy
    private Employee employee;

    @BeforeEach
    void initEach() {
        MockitoAnnotations.openMocks(this);
        employee.setFirstName("Pups");
        employee.setLastName("Komp");
        employee.setEmail("aha@web.de");
    }

    @Test
    void getAll() {
        List<Employee> expected = Arrays.asList(employee, employee);
        when(employeeRepository.findAll()).thenReturn(expected);

        List<Employee> result = employeeService.getAll();

        assertEquals(expected.size(), result.size());
    }

    @Test
    void get() {
        when(employeeRepository.getOne(anyLong())).thenReturn(employee);

        Employee result = employeeService.get(1L);

        assertNotNull(result);
        assertEquals(employee.getFirstName(), result.getFirstName());
        assertEquals(employee.getLastName(), result.getLastName());
        assertEquals(employee.getEmail(), result.getEmail());
    }
}
