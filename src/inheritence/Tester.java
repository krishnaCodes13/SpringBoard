package inheritence;

public class Tester {
	public static void main(String[] args) {
//        DigitalCamera camera = new DigitalCamera("Canon",100);
//        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
		
		  PermanentEmployee permanentEmployee = new PermanentEmployee(112112, "Jobin", 1650.0, 125.0, 3.01f);
		    permanentEmployee.calculateMonthlySalary();
		    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
		            
		    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
		    contractEmployee.calculateSalary();
		    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
    }

}
