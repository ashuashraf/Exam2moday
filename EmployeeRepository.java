package com.org.employee;

import org.springframework.data.repository.CrudRepository;

import com.org.employee.controller.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
