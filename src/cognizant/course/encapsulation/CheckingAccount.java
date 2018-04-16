package cognizant.course.encapsulation;

public class CheckingAccount {
private int custID;
private String name;
private double amount;

public CheckingAccount(){

}

public int getCustID() {
	return custID;
}

public void setCustID(int custID) {
	this.custID = custID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

}
