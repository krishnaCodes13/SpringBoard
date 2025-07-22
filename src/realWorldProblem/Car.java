package realWorldProblem;

public class Car extends Vehicle implements Payable{
	private final int noOfSeats;
	 
	
	public Car(String vehicleNumber, String fuelType, int noOfSeats) {
		super(vehicleNumber, fuelType);
		this.noOfSeats=noOfSeats;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	@Override
	public double generateBill(int days) {
		return this.calculateRentalCharge(days);
	}
	
	@Override
	public double calculateRentalCharge(int days) {
		baseRent = (days*500)+(100*getNoOfSeats());
		tax = (baseRent/100)*10;
		totalTax+=tax;
		super.setRentalCharge(baseRent+tax);
		return super.getRentalCharge();
	}
	
	@Override
	public String toString() {
		return "--- Rental Bill ---\n"+"Vehicle type : Car\n"+""+"Vehicle Number : "+super.getVehicleNumber()+"\n"+"Fuel Type : "+super.getFuelType()+"\n"+"Base Rental : "+this.baseRent+"\n"+"Tax Collected : "+tax+"\n"+"Rental Charge : \u20B9"+super.getRentalCharge();	
		}

	
	
	
	
}
