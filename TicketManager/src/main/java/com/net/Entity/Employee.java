package com.net.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {

	@Id
	private Long empId;
	private String empPass;
	private String empFname;
	private String empLname;
	private String empEmail;
	
}
