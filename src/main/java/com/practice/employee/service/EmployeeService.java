/**
 * 
 */
package com.practice.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.employee.dao.EmployeeDao;
import com.practice.employee.model.Employee;

/**
 * @author Rahul Suryawanshi
 */

@Service
public class EmployeeService {
	
	
	@Autowired EmployeeDao gEmployeeDao;
	
	
	public List<Employee> getEmployeeList(){
		return gEmployeeDao.findAll();
	}
	
	public void addEmployee(Employee employee){
		 gEmployeeDao.save(employee);
	}
	
	public void deleteEmployeeById(Integer employeeId){
		 gEmployeeDao.deleteById(employeeId);
	}
	
}
