package com.revature.pojos;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="COMPLAINTS")
public class Complaints {
	
	@Id
	@Column(name="COMPLAINTID")
	@SequenceGenerator(name="SEQ_COMPLAINID", sequenceName="SEQ_COMPLAINID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_COMPLAINID")
	private int complaintID;
	
	@Column(name= "FILEDBY")
	private int filedBy;
	
	@Column(name= "FILEDAGAINST")
	private int filedAgainst;
	
	@Column(name="DATEFILED")
	//@Temporal(TemporalType.DATE)
	private LocalDate dateFiled;
	
	@Column(name="TIMEFILED")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timeFiled;
	
	@Column(name="DATERESPONSE")
	//@Temporal(TemporalType.DATE)
	private LocalDate dateResponse;
	
	@Column(name="TIMERESPONSE")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp timeResponse;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="RESPONDERID")
	private int responderID;

	public Complaints() {
		// TODO Auto-generated constructor stub
	}

	public Complaints(int complaintID, int filedBy, int filedAgainst, LocalDate dateFiled, Timestamp timeFiled,
			LocalDate dateResponse, Timestamp timeResponse, String description, int responderID) {
		super();
		this.complaintID = complaintID;
		this.filedBy = filedBy;
		this.filedAgainst = filedAgainst;
		this.dateFiled = dateFiled;
		this.timeFiled = timeFiled;
		this.dateResponse = dateResponse;
		this.timeResponse = timeResponse;
		this.description = description;
		this.responderID = responderID;
	}

	public int getComplaintID() {
		return complaintID;
	}

	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}

	public int getFiledBy() {
		return filedBy;
	}

	public void setFiledBy(int filedBy) {
		this.filedBy = filedBy;
	}

	public int getFiledAgainst() {
		return filedAgainst;
	}

	public void setFiledAgainst(int filedAgainst) {
		this.filedAgainst = filedAgainst;
	}

	public LocalDate getDateFiled() {
		return dateFiled;
	}

	public void setDateFiled(LocalDate dateFiled) {
		this.dateFiled = dateFiled;
	}

	public Timestamp getTimeFiled() {
		return timeFiled;
	}

	public void setTimeFiled(Timestamp timeFiled) {
		this.timeFiled = timeFiled;
	}

	public LocalDate getDateResponse() {
		return dateResponse;
	}

	public void setDateResponse(LocalDate dateResponse) {
		this.dateResponse = dateResponse;
	}

	public Timestamp getTimeResponse() {
		return timeResponse;
	}

	public void setTimeResponse(Timestamp timeResponse) {
		this.timeResponse = timeResponse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getResponderID() {
		return responderID;
	}

	public void setResponderID(int responderID) {
		this.responderID = responderID;
	}

}
