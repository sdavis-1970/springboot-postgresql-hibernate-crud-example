package com.davis.springbootpostgresql.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.davis.springbootpostgresql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
