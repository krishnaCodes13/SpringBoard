package Arrays;

class Problem2 {
    
    public static double[] findDetails(double[] salary) {
    	double display[] = new double[3];
    	
    	double sum=0;
    	
    	for(int i=0; i<salary.length; i++) {
    		sum=sum+salary[i];
    	}
    	
    	double greater = 0;
    	double lower = 0;
    	double average = sum/salary.length;
    	
    	
    	
    	for(int i=0; i<salary.length; i++) {
    		if(salary[i]<average) {
    			lower++;
    		}else {
    			greater++;
    		}
    	}
    	for(int i = 0; i<display.length; i++) {
    		if(i==0) {
    			display[i]=average;
    		}else if(i==1) {
    			display[i]=greater;
    		}else {
    			display[i]=lower;
    		}
    	}
        return display;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}

