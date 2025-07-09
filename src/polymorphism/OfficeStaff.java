package polymorphism;

public class OfficeStaff extends Faculty{
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation=designation;
	}
	
	@Override
	public double calculateSalary() {
		if(this.getDesignation().equals("Accountant")) {
			return super.calculateSalary()+10000;
		}else if(this.getDesignation().equals("Clerk")) {
			return super.calculateSalary()+7000;
		}else if(this.getDesignation().equals("Peon")) {
			return super.calculateSalary()+4500;
		}else {
			return 0;
		}
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
