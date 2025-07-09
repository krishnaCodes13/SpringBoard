package interfaces;

public class Seller implements Tax{
	private String location;
	private double taxPercentage;
	
	public Seller(String location) {
		this.location=location;
		if(this.location.equals("Middle east")) {
			this.taxPercentage=15;
		}else if(this.location.equals("Europe")) {
			this.taxPercentage=25;
		}else if(this.location.equals("Canada")) {
			this.taxPercentage=22;
		}else if(this.location.equals("Japan")) {
			this.taxPercentage=12;
		}else {
			this.taxPercentage=0;
		}
	}
	
	@Override
	public double calculateTax(double price) {
		return ((price/100)*this.getTaxPercentage());
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	
	
}
