package abstraction;

public class GraduateStudent extends Student{
	public GraduateStudent(String studentName) {
		super(studentName);
	}
	
	@Override
	public void generateResult() {
		int total=0;
		int[] scores = this.getTestScores();
		for(int i=0; i<scores.length; i++) {
			total=total+scores[i];
		}
		int avg=total/scores.length;
		
		if(avg>=70) {
			this.setTestResult("Pass");
		}else {
			this.setTestResult("Fail");
		}
	}
}
