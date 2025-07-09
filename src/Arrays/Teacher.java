package Arrays;

public class Teacher {
	 private String name;
	    private String subject;
	    private double salary;
	    
	    public Teacher(String name, String subject, double salary){
	        this.name=name;
	        this.subject=subject;
	        this.salary=salary;
	    }
	    
	    public void setTeacherName(String name){
	        this.name=name;
	    }
	    
	    public String getTeacherName(){
	        return this.name;
	    }
	    
	    public void setSalary(double salary){
	        this.salary=salary;
	    }
	    
	    public double getSalary(){
	        return this.salary;
	    }
	    
	    public void setSubject(String subject){
	        this.subject=subject;
	    }
	    
	    public String getSubject(){
	        return this.subject;
	    }
}

