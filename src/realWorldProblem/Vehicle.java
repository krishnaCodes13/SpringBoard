package realWorldProblem;

public abstract class Vehicle {
	private final String vehicleNumber;
	private String fuelType;
	private double rentalCharge;
	
	public Vehicle(String vehicleNumber, String fuelType) {
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
	}
	
	public abstract double calculateRentalCharge(int days);

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getRentalCharge() {
		return rentalCharge;
	}

	public void setRentalCharge(double rentalCharge) {
		this.rentalCharge = rentalCharge;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}	

}
