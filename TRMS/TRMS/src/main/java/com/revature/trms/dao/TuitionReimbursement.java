package com.revature.trms.dao;

import java.sql.Date;

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
	private String eventtype;
	private String status;
	private Date date;
	private int uid;
	private int sid;
	private int dhid;
	private int bcid;
	
	public TuitionReimbursement(){
		super();
	}
	
	public TuitionReimbursement(int trid, double tcost, double amount, String eventtype, String status, Date date, int uid, int sid, int dhid, int bcid){
		this.trid = trid;
		this.tcost =tcost;
		this.amount = amount;
		this.eventtype = eventtype;
		this.status = status;
		this.date = date;
		this.uid = uid;
		this.sid = sid;
		this.dhid = dhid;
		this.bcid = bcid;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
