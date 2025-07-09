/*Find out all the possible permutations of the characters in the string passed to the method findPermutations(). Implement the logic inside findPermutations() method and return a string array containing all the permutations.

Assumption: The length of the string will be 3.

E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.*/

package Arrays;

class Problem7{
    public static String[] findPermutations(String str){
    	 String[] result = new String[6];
         int index = 0;

         char a = str.charAt(0);
         char b = str.charAt(1);
         char c = str.charAt(2);

         result[index++] = "" + a + b + c;
         result[index++] = "" + a + c + b;
         result[index++] = "" + b + a + c;
         result[index++] = "" + b + c + a;
         result[index++] = "" + c + a + b;
         result[index++] = "" + c + b + a;

         return result;
    }
    
    public static void main(String args[]){
        String str = "aad";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}



