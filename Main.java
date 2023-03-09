package com.glearning.Main;

import com.glearning.Admin.*;
import com.glearning.HR.*;
import Tech.*;
import com.glearning.Superdepartment.*;

public class Main {

	public static void main(String[] args) {
		
	
		
		SuperDepartment sDepart= new SuperDepartment("Super Department", " No work as of now", "Nil", "Today is not a Holiday");
		AdminDepartment aDepart= new AdminDepartment("Admin Deaprtment", " Complete ypur Document Submission", "Complete by EOD");
		HrDepartment hDepart= new HrDepartment("Hr Department", "Fill today's timesheet and mark your attendence", "Complete by EOD", "Team Lunch");
		TechDepartment tDepart= new TechDepartment("Tech Department", "Complete coding of module 1", "Complete by EOD", "core java");
		
		//Superdepartment method calling
		System.out.println("Department name is: "+ sDepart.departmentName());
		System.out.println("Work of Department for today is:"+ sDepart.getTodaysWork());
		System.out.println("The Deadline is:"+ sDepart.getWorksDeadline());
		System.out.println("Department Holiday:"+ sDepart.getTodaysAHoliday());
		
		System.out.println();
		
		//Admin method calling

		System.out.println("Department name is: "+ aDepart.departmentName());
		System.out.println("Work of Department for today is:"+ aDepart.getTodaysWork());
		System.out.println("The Deadline is:"+ aDepart.getWorksDeadline());
		
		System.out.println();
		
		//Hr method calling

		System.out.println("Department name is: "+ hDepart.departmentName());
		System.out.println("Work of Department for today is:"+ hDepart.getTodaysWork());
		System.out.println("The Deadline is:"+ hDepart.getWorksDeadline());
		System.out.println("Activity to be performed:"+ hDepart.doActivity());
		
		System.out.println();
		
		//Tech method calling

		System.out.println("Department name is: "+ tDepart.departmentName());
		System.out.println("Work of Department for today is:"+ tDepart.getTodaysWork());
		System.out.println("The Deadline is:"+ tDepart.getWorksDeadline());
		System.out.println("Tech Info is:"+ tDepart.techInformation);
		
		System.out.println();
	
	}	

}
