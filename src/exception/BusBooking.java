package exception;

public class BusBooking {
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount=0;
	
	public BusBooking(int bookingId, String destination, String tripPackage ) {
		this.bookingId=bookingId;
		this.destination=destination;
		this.tripPackage=tripPackage;
	}

	public String bookTrip(String couponCode, int numberOfMembers){
		try {
		if(!this.getDestination().equals("Washington DC") && !this.getDestination().equals("Philadelphia") && !this.getDestination().equals("Orlando") && !this.getDestination().equals("Boston") && !this.getDestination().equals("Atlanta")) {
			throw new InvalidDestinationException("Invalid destination");
		}else if(!this.tripPackage.equals("Regular") && !this.tripPackage.equals("Premium")) {
			throw new InvalidTripPackageException("Invalid package");
		}else if(validateCouponCode(couponCode, numberOfMembers)) {}
		}catch(InvalidDestinationException e) {
			return e.getMessage();
		}catch(InvalidTripPackageException e) {
			return e.getMessage();
		}catch(InvalidCouponCodeException e) {
			return e.getMessage();
		}
		
		if(this.tripPackage.equals("Regular")) {
			totalAmount = numberOfMembers*500;
		}else {
			totalAmount = numberOfMembers*800;
		}
		return "Booking successful";
	}
	
	public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException{
		if(couponCode.equals("BIGBUS") && numberOfMembers>=10) {
			return true;
		}else if(couponCode.equals("MAGICBUS") && numberOfMembers>=15) {
			return true;
		}
		throw new InvalidCouponCodeException("Invalid coupon code");
	}
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTripPackage() {
		return tripPackage;
	}

	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
