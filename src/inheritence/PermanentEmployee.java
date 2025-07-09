package inheritence;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		this.hra=hra;
		this.experience=experience;
	}
	
	public void calculateMonthlySalary() {
		double variableComponent=0;
		if(this.experience<3) {
			variableComponent = (this.basicPay/100)*0;
		}else if(this.experience>=3 && this.experience<5) {
			variableComponent = (this.basicPay/100)*5;
		}else if(this.experience>=5 && this.experience<10) {
			variableComponent = (this.basicPay/100)*7;
		}else if(this.experience>=10) {
			variableComponent = (this.basicPay/100)*12;
		}
		
		this.setSalary(Math.round(this.basicPay+this.hra+variableComponent));
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
}
