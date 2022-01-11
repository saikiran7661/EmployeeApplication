package com.techwave.controllers;

import com.techwave.common.Employee;
import com.techwave.common.ErrorDetails;
import com.techwave.service.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * every request will hit controller based on the url coresponding service called
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController
{
    @Autowired
    EmployeeServiceImpl service;

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    /**
     * @return list of all employee
     * to get all details of employee
     */
    @GetMapping("/employee")
    public List<Employee> getDetails()
    {
        logger.trace("getDetails method accessed");
        return service.getEmployee();
    }

    /**
     * @return  response type is string whether success or not
     * to insert the row
     */
    @PostMapping("/employee")
    public String save(@RequestBody Employee employee)
    { logger.trace("save method accessed");
        return service.saveEmployee(employee);

    }

    /**
     * @param id
     * @return get particular row
     * to get particular row
     */
    @GetMapping("/employee/{id}")
    public Optional<Employee> employeeById(@PathVariable("id") int id) throws ErrorDetails
    {
        logger.trace("employeeById method accessed");
        return service.getEmployeeById(id);

    }

    /**
     * @param  e
     * @param id
     * @return return type is string
     * to update particular row by providing empid and employe details
     */
    @PutMapping("/employee/{id}")
    public String updateById(@RequestBody Employee e,@PathVariable("id") int id)
    {
        logger.trace("updateById method accessed");
        return service.updateEmployeeById(e,id);
    }

    /**
     * @param id
     * @return return type is string
     * to delete particular row
     */
    @DeleteMapping("/employee/{id}")
    public String deleteById(@PathVariable("id") int id)
    {
        logger.trace("deleteById method accessed");
        return  service.deleteByEmployeeId(id);
    }
}
