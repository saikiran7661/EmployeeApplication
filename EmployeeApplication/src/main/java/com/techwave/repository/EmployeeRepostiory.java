package com.techwave.repository;

import com.techwave.common.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * repository class used to connect to db
 */
@Repository
public interface EmployeeRepostiory extends JpaRepository<Employee,Integer>
{
}
