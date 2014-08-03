package com.kondi.android.classroomscheduler;

import java.util.ArrayList;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.PhoneNumber;
import com.google.appengine.datanucleus.annotations.Unowned;
 
@PersistenceCapable
public class Person {

	public static final int ATTENDANCE_CAPABLE = 1<<4;
	public static final int MANAGER = 1<<3;
	public static final int STUDENT = 1<<2;
	
    
	
    @PrimaryKey
	@Persistent
	String email;
	
	@Persistent
	String name;
	
	@Persistent
	Integer privilege;
	
	@Persistent
	PhoneNumber phone;
	
 
	@Persistent(mappedBy = "person",defaultFetchGroup="true")
	 @Unowned
	ArrayList<Attendance> attendances;
	
	@Persistent(mappedBy = "person",defaultFetchGroup="true")
	 @Unowned
	ArrayList<Payment>  payments;
	
	public Person(String email, String name, Integer privilege,
			PhoneNumber phone, ArrayList<Attendance> attendances,
			ArrayList<Payment> payments) {
		super();
		this.email = email;
		this.name = name;
		this.privilege = privilege;
		this.phone = phone;
		this.attendances = attendances;
		this.payments = payments;
	}

	public ArrayList<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(ArrayList<Attendance> attendances) {
		this.attendances = attendances;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 

	public Integer getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Integer privilege) {  
		this.privilege = privilege;
	}

	public Person(String email,  Integer privilege, String name , PhoneNumber phone ) {
		super();
		this.email = email; 
		this.privilege = privilege;
		this.name = name;
		this.phone = phone;
	}

	public boolean addOrUpdateAttendance(Attendance a)
	{
		for(Attendance b : attendances){
			if(b.getStarting_time().equals(a.getStarting_time())
					&&b.getClasscode().equals(a.getClasscode()))
			{
				attendances.remove(b);
				attendances.add(a);
				return true;
			}
		}	
		attendances.add(a);
		
		return false;
	}

	
	 

 
	
	 
	
}
