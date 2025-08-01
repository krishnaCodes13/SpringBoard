package Final;

public class Student {
	private final int STIPEND=100;
	private int studentId;
	private int aggregateMarks;
	
	public double calculateTotalStipend(){
		if(this.aggregateMarks>=85 && this.aggregateMarks<90) {
			return this.STIPEND+10;
		}else if(this.aggregateMarks>=90 && this.aggregateMarks<95) {
			return this.STIPEND+15;
		}else if(this.aggregateMarks>=95 && this.aggregateMarks>=100) {
			return this.STIPEND+20;
		}
		return this.STIPEND;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getAggregateMarks() {
		return aggregateMarks;
	}

	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}

	public int getSTIPEND() {
		return STIPEND;
	}
	
	
	

}
