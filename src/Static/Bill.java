package Static;

public class Bill {
	private static int counter;
	private String billId;
	private String paymentMode;
	
	public Bill(String paymentMode) {
		this.paymentMode=paymentMode;
		this.billId="B"+ ++counter;
	}
	
	static {
		counter=9000;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Bill.counter = counter;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}
