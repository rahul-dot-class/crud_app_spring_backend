/**
 * 
 */
package com.practice.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.employee.model.Employee;

/**
 * @author Rahul Suryawanshi
 */
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
