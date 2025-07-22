package recursion;

public class PanindromTester {
	public static int findReverse(int num, int temp){
		if(num == 0) {
            return temp;
        } else {
            temp = (temp * 10) + (num % 10);
            return findReverse(num / 10, temp); 
        }
	}
	
	public static void main(String args[]){
	    int num = 12321;
        int reverseNum = findReverse(num,0);
        System.out.println(reverseNum);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}
}
