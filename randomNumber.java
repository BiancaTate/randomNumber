package randomNumber;

import java.util.*;
import java.math.*;

public class randomNumber {
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		 int upperBound = 100;
		 int lowerBound = 1;
		 
		 int range = (upperBound - lowerBound) + 1;
		 int random = (int)(Math.random() * range) + lowerBound;
		 
		 final int maxAttempts = 5;
		
	
		System.out.println("We have selected a number between 1 and 100. Can you guess what it is?");
		System.out.println(random);
		Scanner input=new Scanner (System.in);
		System.out.print("Guess 1: ");
		int guess = input.nextInt();

		
		
		
		if (maxAttempts!=0) {
			
			if (guess == random) {
			      System.out.println("Correct! You have chosen the correct number!");
			      guess = input.nextInt();
			}
			
			else if (guess>random) {
				
			    	  System.out.println("Incorrect! Your number is too high! Try again!");
			    	  System.out.print("Guess 1: ");
			    	  guess = input.nextInt();
			    	  
			    	 
			    	  
			
			}
			
			else if(guess<random) { 
			    	  System.out.println("Incorrect! Your number is too low! Try again!");
			    	  System.out.print("Guess : ");
			    	  guess = input.nextInt();
			    	  
			}
		if (maxAttempts==0) {
				System.out.println("You have run out of chances.");
				System.out.println("The correct answer is: " +random);
				}
				 
		} // outer if brackets 
		
		
	 
		
		
		input.close();
		
		
	} //main class bracket
}			// public class bracket
