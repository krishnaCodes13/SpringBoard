package inheritence;

public class ContractEmployee extends Employee{
	private double wage;
	private float hoursWorked;
	
	public ContractEmployee(int employeeId, String employeeName, double wage, float hoursWorked) {
		super(employeeId, employeeName);
		this.wage=wage;
		this.hoursWorked=hoursWorked;
	}
	
	public void calculateSalary() {
		setSalary(Math.round(this.hoursWorked*this.wage));
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
