package polymorphism;

public class PremiumUser extends User {
	private int rewardPoints;
	
	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
	}
	
	public boolean makePayment(double billAmount) {
		if(this.getWalletBalance()>=billAmount) {
			this.setWalletBalance(this.getWalletBalance()-billAmount);
			rewardPoints = (int) (rewardPoints + ((billAmount/100)*10));
			return true;
		}
		return false;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;	
	}
	
	

}
