package basic;

import java.util.Scanner;

public class LearnScanner {
	int bottlesprice;
	double singlebottlePrice;
	String colour;
	
	
	public static void main (String[]args) {
		/* Scanner method and what is (system.in) inside the parenteces the system in is to input 
		the console without system in you cannot put the input*/
		
		Scanner cokebottle  = new Scanner(System.in);
		
		// call int variable 
		System.out.println("Enter the bottle price  :");
		int bottles = cokebottle.nextInt();
		System.out.println("the whole bottles case peice is :" + ""+ bottles);
		// why i gave a empty print statement because i want to be a space after the print statement its up to you 
		System.out.println();
		
		// call double variable 
		System.out.println("Enter the  single bottle price  :");
		double perbottle = cokebottle.nextDouble();
		System.out.println("The single bottle price is: "+ "" +perbottle);
		System.out.println();
		
	// call by string variable 
		System.out.println("Enter the  bottle colour   :");
		String clbt = cokebottle.next();
		System.out.println("The bottle colour is: "+ "" +clbt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	}


