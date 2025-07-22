package inheritence;

public class Parent {
	protected String name;
	private String property;
	
	public Parent(String property) {
		this.property=property;
	}
	
	public void displayDetails() {
		System.out.println("name : "+this.name+"Property : "+this.property);
	}

}
