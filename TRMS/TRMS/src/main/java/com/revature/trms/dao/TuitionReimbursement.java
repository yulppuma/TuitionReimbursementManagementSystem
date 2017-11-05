package com.revature.trms.dao;

import java.sql.Date;
import java.util.Calendar;

public class TuitionReimbursement {
 /*
	id
	Event_type
	Description
	Employee
	Director Supervisor
	Department Head
	BenCo
*/
	private int trid;
	private double tcost;
	private double amount;
	private String loc;
	private String eventtype;
	private String status;
	private String details;
	private String justification;
	private Date startDate;
	private Date todaysDate;
	private int uid;
	private int sid;
	private int dhid;
	private int bcid;
	private String grade;
	
	public TuitionReimbursement(){
		super();
	}
	
	public TuitionReimbursement(int trid, double tcost, double amount, String loc, String justification, String details, String eventtype, int uid, int sid, int dhid, int bcid){
		this.trid = trid;
		this.tcost =tcost;
		this.amount = amount;
		this.loc = loc;
		this.details = details;
		this.eventtype = eventtype;
		this.status = "pending";
		this.uid = uid;
		this.sid = sid;
		this.dhid = dhid;
		this.bcid = bcid;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getTodaysDate() {
		return todaysDate;
	}

	public void setTodaysDate(Date todaysDate) {
		this.todaysDate = todaysDate;
	}

	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}

	public double getTcost() {
		return tcost;
	}

	public void setTcost(double tcost) {
		this.tcost = tcost;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEventtype() {
		return eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getDhid() {
		return dhid;
	}

	public void setDhid(int dhid) {
		this.dhid = dhid;
	}

	public int getBcid() {
		return bcid;
	}

	public void setBcid(int bcid) {
		this.bcid = bcid;
	}
	
	
	
}
