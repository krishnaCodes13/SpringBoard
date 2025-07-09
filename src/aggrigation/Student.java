package aggrigation;

public class Student {
	private int rollNumber;
	private String studentName;
	private Subject subject;
	
	Student(int rollNumber, String studentName, Subject subject){
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.subject=subject;
	}
	
	public void displayDetails() {
		System.out.println("Student Roll No.: "+ rollNumber);
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject Name: " + subject.getSubjectName());
	}
	
	public static void main(String args[]) {
		Subject subject = new Subject("Maths");
		Student student = new Student(101, "Nate", subject);
		student.displayDetails();
	}
}
