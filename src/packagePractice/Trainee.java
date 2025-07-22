package packagePractice;

public class Trainee extends Employee{
	public Trainee(String employeeName) {
		super(employeeName);
		this.bonusPercent = 5.0f;
	}
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		System.out.println("Bonus percentage for trainee: " + this.bonusPercent);
	}
}
