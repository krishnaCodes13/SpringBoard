package Arrays;

public class Problem4 {
	private int marks[];
	private char grade[];
	
	public Problem4(int marks[]) {
		this.marks=marks;
		this.grade=new char[marks.length];
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrade(char[] grade) {
		this.grade = grade;
	}
	
	public void findGrade() {
		for(int i = 0; i<marks.length; i++) {
			if(marks[i]>=92) {
				grade[i]='E';
			}else if(marks[i]>=85) {
				grade[i]='A';
			}else if(marks[i]>=70) {
				grade[i]='B';
			}else if(marks[i]>=65) {
				grade[i]='C';
			}else{
				grade[i]='D';
			}
			}
	}

}
