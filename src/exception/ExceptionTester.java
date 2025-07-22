package exception;

public class ExceptionTester {
	  public static void main(String[] args) {
          
	        try {
	            Applicant applicant= new Applicant();
	            applicant.setName(null);
	            applicant.setJobProfile("officer");
	            applicant.setAge(100);
	            
	            Validator validator = new Validator();
	                  
	            validator.validate(applicant);
	            System.out.println("Application submitted successfully!");
	        } 
	        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
