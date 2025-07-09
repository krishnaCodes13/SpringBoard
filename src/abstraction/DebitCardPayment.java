package abstraction;

public class DebitCardPayment extends Payment{
	private static int counter;
	private double discountPercentage;
	
	public DebitCardPayment(int customerId) {
		super(customerId);
		counter++;
		setPaymentId("D"+ counter);
	}
	
	static {
		counter=1000;
	}
	
	@Override
	public double payBill(double amount) {
		if(amount<=500) {
			super.setServiceTaxPercentage(2.5);
			this.discountPercentage=1;
		}else if(amount>500 && amount<=1000) {
			super.setServiceTaxPercentage(4);
			this.discountPercentage=2;
		}else {
			super.setServiceTaxPercentage(5);
			this.discountPercentage=3;
		}
		amount=amount+(amount/100)*super.getServiceTaxPercentage();
		return amount-((amount/100)*getDiscountPercentage());
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	
}
