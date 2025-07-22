package realWorldProblem;

public class Bike extends Vehicle implements Payable{
	private final int engineCapacity;
	
	public Bike(String vehicleNumber, String fuelType, int engineCapacity) {
		super(vehicleNumber, fuelType);
		this.engineCapacity=engineCapacity;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	@Override
	public double generateBill(int days) {
		return this.calculateRentalCharge(days);
	}
	
	@Override
	public double calculateRentalCharge(int days) {
		baseRent = (days*200)+(50*getEngineCapacity()/100);
		tax = (baseRent/100)*10;
		totalTax+=tax;
		super.setRentalCharge(baseRent+tax);
		return super.getRentalCharge();
	}
	
	@Override
	public String toString(){
		return "--- Rental Bill ---\n"+"Vehicle type : Bike\n"+""+"Vehicle Number : "+super.getVehicleNumber()+"\n"+"Fuel Type : "+super.getFuelType()+"\n"+"Base Rental : "+this.baseRent+"\n"+"Tax Collected : "+tax+"\n"+"Rental Charge : \u20B9"+super.getRentalCharge();	
		}
	
	
}
