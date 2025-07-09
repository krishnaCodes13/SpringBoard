package Arrays;

public class Tester {

	public static void main(String[] args) {
//		Teacher Sanket = new Teacher("Sanket", "Computer Science", 90000);
//	    Teacher Aakash = new Teacher("Aakash", "Electronics", 800000);
//	    Teacher Mayur = new Teacher("MAyur", "Google", 90000);
//	    Teacher Krishna = new Teacher("Krishna", "Sports", 90000);
//	    
//	    Teacher display[] = {Sanket, Aakash, Mayur, Krishna};
//	    
//	    for(int i = 0; i<display.length; i++){
//	        System.out.println("Name : "+display[i].getTeacherName() + " , "+"Subject : "+display[i].getSubject()+" , "+"Salary : "+display[i].getSalary());
//	    }
		
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Problem4 student = new Problem4(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}

	}

}
