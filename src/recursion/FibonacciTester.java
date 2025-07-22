package recursion;

public class FibonacciTester {
	 public static int findFibonacci(int n) {
	        int index = n - 1;  // Adjusting input to 0-based index

	        return fibonacci(index);
	    }

	    private static int fibonacci(int n) {
	        if (n == 0) return 0;
	        if (n == 1) return 1;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String args[]) {
	        int n = 0;
	        if(n!=0)
	            System.out.println(findFibonacci(n));
	        else
	            System.out.println("Please enter a valid value for n");
	    }
}
