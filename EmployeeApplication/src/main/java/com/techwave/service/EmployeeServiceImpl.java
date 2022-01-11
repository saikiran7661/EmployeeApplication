package com.techwave.service;

import com.techwave.common.Employee;
import com.techwave.common.ErrorDetails;
import com.techwave.repository.EmployeeRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Employeeservice is implementated from EmployeeInterface
 * service consist of business
 */
@Service
public class EmployeeServiceImpl implements com.techwave.service.EmployeeService
{
    @Autowired
    EmployeeRepostiory repostiory;

    /**
     * @param employee
     * @return return type string
     */
    @Override
    public String saveEmployee( Employee employee) throws ErrorDetails
    {
      int e=  employee.getId();
        Optional<Employee> e1=repostiory.findById(e);
        if(!e1.isPresent()) {
            repostiory.save(employee);
            return "1 row is inserted";
        }
        else
        {
            throw new ErrorDetails("employee is already is presesnt", 400l);
        }
    }

    /**
     * @return  list employee
     */
    @Override
    public List<Employee> getEmployee()
    {
         List<Employee> e=repostiory.findAll();
         if(e.isEmpty())
         {
             throw  new ErrorDetails("No Employee is present",400l);
         }
         else
         {
             return e;
         }
    }

    /**
     * @param i
     * @return list of employee
     */
    @Override
    public Optional<Employee> getEmployeeById(int i) throws ErrorDetails
    {
        Optional<Employee> e= repostiory.findById(i);
        if(!e.isPresent())
            throw new ErrorDetails("Employee not found", 400L);
        else
            return e;
    }

    /**
     * @param e
     * @param id
     * @return string
     *
     */
    @Override
    public String updateEmployeeById(Employee e, int id) throws ErrorDetails
    {
        Optional<Employee> emp=repostiory.findById(id);
        if(emp.isPresent())
        {
            emp.get().setName(e.getName());
            emp.get().setGender(e.getGender());
            emp.get().setAge(e.getAge());
            emp.get().setDepartment(e.getDepartment());
            emp.get().setYearOfJoining(e.getYearOfJoining());
            emp.get().setSalary(e.getSalary());
            repostiory.save(emp.get());
            return "1 row is updated";
        }
        else
        {
            throw new ErrorDetails("Employee is not present",400l);
        }
    }

    /**
     * @param id
     * @return delete employee  by id
     */
    public String deleteByEmployeeId(int id)
    {
        Optional<Employee> emp=repostiory.findById(id);
        if(emp.isPresent())
        {
            repostiory.deleteById(id);
            return "1 row is delete";
        }
        else
        {
            throw new ErrorDetails("employee is not found",400l);
        }
    }

}
