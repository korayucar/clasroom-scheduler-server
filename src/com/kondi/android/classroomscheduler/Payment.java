package com.kondi.android.classroomscheduler;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Email;
 
@PersistenceCapable
public class Payment {
	
	
	@Persistent
	 private Person person;
	 
	 
	
	
	@Persistent
	Date date;
	 
	@Persistent
	Integer classespaid;
	
	@Persistent
	Integer money;
	
	public Payment(  Date date,   Integer classespaid , Integer money) {
		super(); 
		this.date = date;
		 
		this.classespaid = classespaid;
		this.money = money;
	}
 

	public Integer getMoney() {
		return money;
	}


	public void setMoney(Integer money) {
		this.money = money;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	 

	public Integer getClassespaid() {
		return classespaid;
	}

	public void setClassespaid(Integer classespaid) {
		this.classespaid = classespaid;
	}


 
	 

	
}
