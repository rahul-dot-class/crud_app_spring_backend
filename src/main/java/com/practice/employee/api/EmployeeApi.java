/**
 * 
 */
package com.practice.employee.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.employee.model.Employee;
import com.practice.employee.service.EmployeeService;

/**
 * @author Rahul Suryawanshi
 */

@RestController
@CrossOrigin
public class EmployeeApi {
	
	@Autowired EmployeeService gEmployeeService;
	
	@GetMapping("/getEmployeeList")
	public ResponseEntity<List<Employee>> getEmployeeList() {
		return new ResponseEntity<>(gEmployeeService.getEmployeeList(), HttpStatus.OK) ;
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		gEmployeeService.addEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK) ;
	}
	
	@GetMapping("/deleteByEmployeeId")
	public ResponseEntity<String> deleteByEmployeeId(@RequestParam ("employeeId") Integer employeeId) {
		gEmployeeService.deleteEmployeeById(employeeId);
		return new ResponseEntity<>("Success", HttpStatus.OK) ;
	}

}
