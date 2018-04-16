package cognizant.course.java7;

public class Manager extends Employee{

	private String depName;

	public Manager(int empId, String empName, String nsr, double salary, String depName) {
		super(empId, empName, nsr, salary);
		this.depName = depName;
	}

	public String getDepName() {
		return depName;
	}


}
