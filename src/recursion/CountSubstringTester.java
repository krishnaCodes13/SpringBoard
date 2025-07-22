package recursion;

public class CountSubstringTester {
	 public static int countSubstring(String inputString, String substring, int count) {
         if (inputString.length() < substring.length()) {
            return count;
        }
        if (inputString.startsWith(substring)) {
            return countSubstring(inputString.substring(substring.length()), substring, count + 1);
        } else {
            return countSubstring(inputString.substring(1), substring, count);
        }
    }
   
    public static void main(String args[]) {
        int count = countSubstring("I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy","happy", 0);
        System.out.println(count);
    }

}
