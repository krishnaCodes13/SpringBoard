package abstraction;

public class CreditCardPayment extends Payment{
	private static int counter;
	
	public CreditCardPayment(int customerId) {
		super(customerId);
		counter++;
		setPaymentId("C"+ counter);
	}
	
	static {
		counter=1000;
	}
	
	@Override
	public double payBill(double amount) {
		if(amount<=500) {
			super.setServiceTaxPercentage(3);
		}else if(amount>500 && amount<=1000) {
			super.setServiceTaxPercentage(5);
		}else {
			super.setServiceTaxPercentage(6);
		}
		return amount=amount+(amount/100)*super.getServiceTaxPercentage();
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	
}
