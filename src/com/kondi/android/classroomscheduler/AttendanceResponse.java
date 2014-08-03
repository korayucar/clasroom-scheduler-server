package com.kondi.android.classroomscheduler;

public class AttendanceResponse {

	Attendance att;
	String name;
	public AttendanceResponse(Attendance att, String name) {
		super();
		this.att = att;
		this.name = name;
	}
	public Attendance getAtt() {
		return att;
	}
	public void setAtt(Attendance att) {
		this.att = att;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
