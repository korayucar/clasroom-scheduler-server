package com.kondi.android.classroomscheduler;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
 
@PersistenceCapable
public class Attendance {
 
	private static Integer PRESENT = Integer.valueOf(2);
	private static Integer ABSENT = Integer.valueOf(0);

	
	
	 
	@Persistent
	private Long starting_time;
	
	 @Persistent
	 private Person person;
	 
	@Persistent
	private Integer status;
	
	
	
	@Persistent	
	private String classcode;
	 
	
	public Attendance(Long starting_time, Person person, Integer status,
			String classcode) {
		super();
		this.starting_time = starting_time;
		this.person = person;
		this.status = status;
		this.classcode = classcode;
	}

	public Attendance(Integer status, Long starting_time, String classcode ) {
		super();
		this.status = status;
		this.starting_time = starting_time;
		this.classcode = classcode; 
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getStarting_time() {
		return starting_time;
	}

	public void setStarting_time(Long starting_time) {
		this.starting_time = starting_time;
	}

	public String getClasscode() {
		return classcode;
	}

	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return person == null ?"null":person.getEmail() +  "   starts at " +starting_time +  "  location is " +classcode ;
	}
	
// 
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Attendance)
//			return false;
//		Attendance other = (Attendance) obj;
//		return person.equals(other.person) &&
//				starting_time.equals(other.starting_time) && 
//				classcode.equals(other.classcode);
//	}
//	
//	@Override
//	public int hashCode() {
//		return classcode.hashCode() + starting_time.hashCode() + person.hashCode();
//	}
//	 

	 
	
	
}
