package generics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;



public class ArrayPrinting {
	
	public static <T> void printSingle(T value) {
		System.out.println(value);
	}
	
	public static<T>void printArray(T[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		
		}
	}
	public static void main(String [] args) {
		String name[] = {"Krishna", "Sanket", "Aakash", "Mayur"};//wrapper classes no autoboxing
		Integer jersyNumber[] = {13,1,18,7}; // wrapper classes no autoboxing
		
		int number = 15; //uses autoboxing here convert int = Integer
		double amount =1234;//uses autoboxing here convert int = Integer
		char ch = 'C';//uses autoboxing here convert int = Integer
		
		printArray(name);
		printArray(jersyNumber);
		printSingle(number);
		printSingle(amount);
		printSingle(ch);
		
		LinkedList<String> ls = new LinkedList<>();
		HashSet<String>hs = new HashSet<>();
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		
		
	}
}
