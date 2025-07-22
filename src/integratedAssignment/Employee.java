package integratedAssignment;

public abstract class Employee {
	protected String employeeId;
	private String employeeName;
	private double salary;
	protected static int contractIdCounter;
	protected static int permenantIdCounter;
	
	public Employee(String emloyeeName) {
		this.employeeName=employeeName;
	}
	
	static {
		contractIdCounter=10000;
		permenantIdCounter=10000;
	}
	
	public abstract void calculateSalary(float salaryFactor) throws InvalidExperienceException;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		if(employeeName.matches("^([A-Z][a-z]+)( [A-Z][a-z]+)+$")) {
			this.employeeName=employeeName;
		}else {
			System.out.println("Invalid Name.");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}else {
			this.salary=0;
		}
	}

	public static int getContractIdCounter() {
		return contractIdCounter;
	}

	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}

	public static int getPermenantIdCounter() {
		return permenantIdCounter;
	}

	public static void setPermenantIdCounter(int permenantIdCounter) {
		Employee.permenantIdCounter = permenantIdCounter;
	}
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}
	
}
