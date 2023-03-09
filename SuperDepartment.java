package com.glearning.Superdepartment;

public class SuperDepartment {

	public String departname;
	public String todaysWork;
	public String workDeadline;
	public String todaysHoliday;
	
	public SuperDepartment(String departname, String todaysWork, String workDeadline, String todaysHoliday) {
		this.departname= departname;
		this.todaysWork= todaysWork;
		this.workDeadline= workDeadline;
		this.todaysHoliday= todaysHoliday;
	}
	
	public SuperDepartment(String departname, String todaysWork, String workDeadline  ) {
		this.departname= departname;
		this.todaysWork= todaysWork;
		this.workDeadline= workDeadline;
	}
	
	public String departmentName() {
		return departname;
	}
	
	public String getTodaysWork() {
		return todaysWork;
		
	}
	
	public String getWorksDeadline() {
		return workDeadline;
	}
	
	public String getTodaysAHoliday() {
		return todaysHoliday;
	}
	
}

