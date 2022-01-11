package com.techwave.common;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class
 */
@Entity
public class Employee
{
        @Id
      private  int id;
      private String name;
      private int age;
      private String gender;
      private String department;
      private int yearOfJoining;
      private double salary;
    /**
     * @return integer type
     */
    public int getId() {
        return id;
    }
    /**
     * @param id  integer type
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return string type
     */
    public String getName() {
        return name;
    }
    /**
     * @param name string type
     *
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return integer type
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age integer type
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return string
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender string type
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @return string
     */
    public String getDepartment() {
        return department;
    }
    /**
     * @param department string type
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * @return integer type
     */
    public int getYearOfJoining() {
        return yearOfJoining;
    }
    /**
     * @param yearOfJoining integer type
     */
    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
    /**
     * @return double
     */
    public double getSalary() {
        return salary;
    }
    /**
     * @param salary double type
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**
     * @param id
     * @param name
     * @param age
     * @param gender
     * @param department
     * @param yearOfJoining
     * @param salary
     * to instantious value to private variable
     */
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    /**
     * default constructor
     */
    public Employee() {
    }
}
