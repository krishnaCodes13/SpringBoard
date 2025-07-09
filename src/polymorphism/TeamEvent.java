package polymorphism;

public class TeamEvent extends Event{
	private int noOfParticipants;
	private int teamNo;
	
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants=noOfParticipants;
		this.teamNo=teamNo;
	}
	
	@Override
	public void registerEvent() {
		if(getEventName().equals("Singing")){
			setRegistrationFee(4*getNoOfParticipants());
		}else if(getEventName().equals("Dancing")){
			setRegistrationFee(6*getNoOfParticipants());
		}else if(getEventName().equals("DigitalArt")) {
			setRegistrationFee(8*getNoOfParticipants());
		}else if(getEventName().equals("Acting")) {
			setRegistrationFee(10*getNoOfParticipants());
		}else {
			setRegistrationFee(0);
		}
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
}
