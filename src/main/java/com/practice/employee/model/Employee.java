/**
 * 
 */
package com.practice.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Rahul Suryawanshi
 */

@Getter
@Setter
@ToString
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	
	private String employeeFirstName;
	
	private String employeeLastName;
	
	@Column(unique = true,nullable=false)
	private String emailAddress;

}
