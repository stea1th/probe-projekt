package de.stea1th.probeserver.repository;

import de.stea1th.probeserver.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
