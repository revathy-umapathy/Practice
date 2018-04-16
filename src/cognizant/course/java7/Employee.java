package cognizant.course.java7;

public class Employee {
private int empId;
private String empName;
private String nsr;
private double salary;

//immutable class -
//private fields
//No Regular setters or getters
//valid/purpose full methods to update or operate a field
//setting or initialize the values in constructors
//getters to read the values of fields

public Employee(int empId,String empName, String nsr, double salary){
this.empId = empId;
this.empName = empName;
this.nsr = nsr;
this.salary = salary;
}

public void setEmpName(String newName) {
	if(newName!=null)
	{
	this.empName = newName;
	}
}

public void raiseSalary(double increaseAmt) {
	this.salary += increaseAmt;
}

public int getEmpId() {
	return empId;
}

public String getEmpName() {
	return empName;
}

public String getNsr() {
	return nsr;
}

public double getSalary() {
	return salary;
}

}
