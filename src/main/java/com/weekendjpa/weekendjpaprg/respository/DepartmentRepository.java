package com.weekendjpa.weekendjpaprg.respository;

import com.weekendjpa.weekendjpaprg.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
