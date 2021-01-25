package de.stea1th.probeserver.service;

import de.stea1th.probeserver.entity.Employee;
import de.stea1th.probeserver.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee get(long id) {
        return employeeRepository.getOne(id);
    }
}
