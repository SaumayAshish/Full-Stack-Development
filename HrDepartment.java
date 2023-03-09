package com.glearning.HR;

import com.glearning.Superdepartment.*;

public class HrDepartment extends SuperDepartment {
	public String activity;
	
	
	public HrDepartment(String departname, String todaysWork, String workDeadline, String activity) {
		super(departname, todaysWork, workDeadline);
		this.activity=activity;
		// TODO Auto-generated constructor stub
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
	
	public String doActivity() {
		return activity;
	}
	
}
