package packagePractice;

public class Employee {
	private String employeeName;
	protected float bonusPercent;
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	protected void displayEmployeeDetails() {
		System.out.println("Displaying employee details \n***************");
		System.out.println("Employee Name: " + this.employeeName);
	}
}
