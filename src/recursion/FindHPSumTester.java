package recursion;

public class FindHPSumTester {
	 public static double findHPSum(int num) {
	        if (num == 1) {
	            return 1.0;
	        } else {
	            return 1.0 / num + findHPSum(num - 1);
	        }
	    }
	    
	    public static void main(String args[]) {
	        System.out.println(findHPSum(3));
	    }

}
