package exception;



public class Validator {
	public boolean validateName(String name){
		if(name!=null && !name.trim().isEmpty()){
			return true;
		}
		return false;
	}
	
	public boolean validateJobProfile(String jobProfile){
		if(jobProfile.equalsIgnoreCase("Associate")||jobProfile.equalsIgnoreCase("Clerk")||jobProfile.equalsIgnoreCase("Executive")||jobProfile.equalsIgnoreCase("Officer")) {
			return true;
		}
		return false;
	}
	
	public boolean validateAge(int age){
		if(age>=18 && age<=30) {
			return true;
		}
		return false;
	}
	
	public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException{
			if(this.validateName(applicant.getName())==false) {
				throw new InvalidNameException("invalid name");
			}
			
			if(this.validateJobProfile(applicant.getJobProfile())==false) {
				throw new InvalidJobProfileException("Invalid job profile");
			}
			
			if(this.validateAge(applicant.getAge())==false) {
				throw new InvalidAgeException("Invalid age");
			}
	}

}
