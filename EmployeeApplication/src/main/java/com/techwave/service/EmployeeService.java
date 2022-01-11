package com.techwave.service;

import com.techwave.common.Employee;
import java.util.List;
import java.util.Optional;
/**
 * Employeeinterface class
 */

public interface EmployeeService
{
    String saveEmployee( Employee e);
    List<Employee> getEmployee();
    Optional<Employee> getEmployeeById(int i);
    String updateEmployeeById(Employee e, int id);
    String deleteByEmployeeId(int id);
}
