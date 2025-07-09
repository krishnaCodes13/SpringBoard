package polymorphism;

public class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowencePercentage;
	
	public Faculty(String name, float basicSalary) {
		this.name=name;
		this.basicSalary=basicSalary;
		this.bonusPercentage=4;
		this.carAllowencePercentage=2.5f;
	}
	
	public double calculateSalary() {
		return this.getBasicSalary()+(this.getBasicSalary()/100)*(this.getBonusPercentage()+this.getCarAllowencePercentage());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowencePercentage() {
		return carAllowencePercentage;
	}

	public void setCarAllowencePercentage(float carAllowencePercentage) {
		this.carAllowencePercentage = carAllowencePercentage;
	}
	
	

}
