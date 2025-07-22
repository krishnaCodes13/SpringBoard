package exception;

public class BookingTester {
	 public static void main(String[] args) {
			BusBooking booking = new BusBooking(101,"Orlando", "Regular");
			String result = booking.bookTrip("bigbus", 11);
			if(result.equals("Booking successful")){
				System.out.println(result);
				System.out.println("Total amount for the trip: " + booking.getTotalAmount());
			}
			else{
				System.out.println(result);
				System.out.println("Your booking was not successful, please try again!");
			}
		}

}
