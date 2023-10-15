package com.net.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ticketId;
	private String subject;
	private String createrName;
	private Long createrId;
	private String createrEmail;
	private String ticketStatus;
	private String description;
	private String snapshot;
	private String time;
	
}
