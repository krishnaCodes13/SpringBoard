package Static;

public class Booking {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvailable;
	
	public Booking(String customerEmail, int seatsRequired) {
		this.customerEmail=customerEmail;
		this.seatsRequired=seatsRequired;
	}
	
	static {
		seatsAvailable=400;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getSeatsRequired() {
		return seatsRequired;
	}

	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}

	public boolean isBooked() {
		if(this.getSeatsRequired()<=getSeatsAvailable()) {
			setSeatsAvailable(getSeatsAvailable()-this.seatsRequired);
			return true;
		}
		return false;	
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public static int getSeatsAvailable() {
		return seatsAvailable;
	}

	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
	

}
