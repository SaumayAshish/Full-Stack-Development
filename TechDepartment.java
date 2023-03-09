package Tech;

import com.glearning.Superdepartment.*;

public class TechDepartment extends SuperDepartment {
	
	public String techInformation;

	public TechDepartment(String departname, String todaysWork, String workDeadline, String techInformation) {
		super(departname, todaysWork, workDeadline);
		this.techInformation= techInformation;
		
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
	
	public String getTechStackInformation() {
		return techInformation;
	}
}
