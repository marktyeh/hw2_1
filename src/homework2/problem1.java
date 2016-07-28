package homework2;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		String sentence, reverse = "";
		Scanner in = new Scanner (System.in);
	
		
		System.out.println("Please enter a string to reverse");
		sentence =  in.nextLine();
	
		int length = sentence.length();
		
		for ( int i = length - 1 ; i>=0 ; i--);
		reverse = reverse + sentence.string(i);
		
		System.out.println("Output: " +reverse);
		
		
		//String[] words = sentence.split("\\s+"); //tells it to split the string
		
		
		

	}

}
