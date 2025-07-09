package polymorphism;

public class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	public Event(String eventName, String participantName) {
		this.eventName=eventName;
		this.participantName=participantName;
	}
	
	public void registerEvent() {
		if(getEventName().equals("Singing")) {
			setRegistrationFee(8);
		}else if(getEventName().equals("Dancing")){
			setRegistrationFee(10);
		}else if(getEventName().equals("DigitalArt")) {
			setRegistrationFee(12);
		}else if(getEventName().equals("Acting")) {
			setRegistrationFee(15);
		}else {
			setRegistrationFee(0);
		}
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	
}
