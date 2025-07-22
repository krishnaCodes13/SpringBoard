package integratedAssignment;

public class ContractEmployee extends Employee {
	private double wagePerHour;
	
	public ContractEmployee(String employeeName, double wagePerHour) {
		super(employeeName);
		this.wagePerHour=wagePerHour;
		super.employeeId="C"+ ++Employee.contractIdCounter;
	}
	
	@Override
	public void calculateSalary(float hoursWorked) {
		if(hoursWorked>=190) {
			super.setSalary(Math.round(hoursWorked*this.wagePerHour));
		}else {
			super.setSalary(Math.round((hoursWorked*this.wagePerHour)-((190-hoursWorked)*(this.wagePerHour/2))));
		}
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour();
	}

}
