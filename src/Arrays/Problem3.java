package Arrays;

public class Problem3 {
	 public static int[] findLeapYears(int year){
	     int count = 0;
	     int leapYear[] = new int[15];
	     int k = 0;
	     
	    	 while(count<15) { 
	    	 if(year%4==0 && year%100!=0|| year%400==0) {
	    		 leapYear[k]=year;
	    		 count++;
	    		 k++;
	    	 }
	    	 year++;
	    	 
	     }
	        return leapYear;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }

}
