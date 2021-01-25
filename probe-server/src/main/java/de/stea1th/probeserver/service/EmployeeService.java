package de.stea1th.probeserver.service;


import de.stea1th.probeserver.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee get(long id);

}
