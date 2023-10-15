package com.net.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "admin")
public class Admin {

	@Id
	private long adminId;
	private String adminPass;
	private String adminFname;
	private String adminLname;
	private String adminEmail;
}