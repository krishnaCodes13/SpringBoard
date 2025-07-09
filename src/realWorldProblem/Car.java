package realWorldProblem;

public class Car extends Vehicle{
	private final int noOfSeats;
	
	public Car(String vehicleNumber, String fuelType, int noOfSeats) {
		super(vehicleNumber, fuelType);
		this.noOfSeats=noOfSeats;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	@Override
	public double calculateRentalCharge(int days) {
		super.setRentalCharge(days*500+100*getNoOfSeats());
		return super.getRentalCharge();
	}
	
	@Override
	public String toString() {
		return "Car Details :\n"+ "Vehicle Number : "+super.getVehicleNumber()+"\n"+"Fuel Type : "+super.getFuelType()+"\n"+"Rental Charge : "+super.getRentalCharge();	
		}

	
	
	
	
}
