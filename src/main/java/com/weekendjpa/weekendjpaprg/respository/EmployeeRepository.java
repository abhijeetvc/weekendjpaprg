package com.weekendjpa.weekendjpaprg.respository;

import com.weekendjpa.weekendjpaprg.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
