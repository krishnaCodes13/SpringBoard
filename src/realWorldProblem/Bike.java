package realWorldProblem;

public class Bike extends Vehicle{
	private final int engineCapacity;
	
	public Bike(String vehicleNumber, String fuelType, int engineCapacity) {
		super(vehicleNumber, fuelType);
		this.engineCapacity=engineCapacity;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	@Override
	public double calculateRentalCharge(int days) {
		super.setRentalCharge(days*200+50*getEngineCapacity()/100);
		return super.getRentalCharge();
	}
	
	@Override
	public String toString(){
		return "Bike Details :\n"+ "Vehicle Number : "+super.getVehicleNumber()+"\n"+"Fuel Type : "+super.getFuelType()+"\n"+"Rental Charge : "+super.getRentalCharge();	
		}
	
	
}
