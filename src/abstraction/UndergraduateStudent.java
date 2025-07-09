package abstraction;

public class UndergraduateStudent extends Student {
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}
	
	@Override
	public void generateResult() {
		int total=0;
		int[] scores = this.getTestScores();
		for(int i=0; i<scores.length; i++) {
			total=total+scores[i];
		}
		float avg=total/scores.length;
	
		
		if(avg>=60) {
			this.setTestResult("Pass");
		}else {
			this.setTestResult("Fail");
		}
	}
}
