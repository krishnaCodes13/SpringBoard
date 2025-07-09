package Static;


class Tester {
    public static void main(String[] args) {

//        Bill bill1 = new Bill("DebitCard");
//        Bill bill2 = new Bill("PayPal");
//        
//        //Create more objects and add them to the bills array for testing your code
//              
//        Bill[] bills = { bill1, bill2 };
//              
//        for (Bill bill : bills) {
//            System.out.println("Bill Details");
//            System.out.println("Bill Id: " + bill.getBillId());
//            System.out.println("Payment method: " + bill.getPaymentMode());
//            System.out.println();
//       }
    	
//    	Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
//		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
//		
//		//Create more objects and add them to the participants array for testing your code
//		
//		Participant[] participants = { participant1, participant2 };
//		
//		for (Participant participant : participants) {
//			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
//		}
    	
    	Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);
        Booking booking3 = new Booking("krishna@gmail.com", 100);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2, booking3 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}


