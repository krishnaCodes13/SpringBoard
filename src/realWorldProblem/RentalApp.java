package realWorldProblem;

public class RentalApp {
	public static void main(String[] args) {
		Car car = new Car("MH12KQ2849", "CNG", 6);
		Bike bike = new Bike("MH12UU8398", "Petrol", 200);
		
		car.calculateRentalCharge(3);
		bike.calculateRentalCharge(3);
		
		System.out.println(car);
		System.out.println(bike);
	}

}
