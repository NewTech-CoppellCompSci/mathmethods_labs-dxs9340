package labs;

import java.util.Scanner;



public class Lab01 {

	public static void main(String[] args) {
		
//		problem01();
//		problem02();
//		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		//import scanner
		Scanner inkey = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter a positive integer: ");
		
		//store input
		int input = inkey.nextInt();
		System.out.println("");
		
		//prompt user
		System.out.print("Enter another positive integer: ");
		
		//store input
		int input2 = inkey.nextInt();
		System.out.println("");
		
		//raises input to the power of input2
		double result = Math.pow(input, input2);
		// turns double result into an integer
		int actresult = (int) result;
		
		//print results
		System.out.println(input + "^" + input2 + " = " + result);
		
		System.out.println("\n\n\n ");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		//import scanner
		Scanner inkey = new Scanner(System.in);
		
		//prompt user
		System.out.println("Enter a positive integer: " );
		//store input
		double input = inkey.nextDouble();
		System.out.println("");
		
		//square roots input
		double result = Math.sqrt(input);
		
		//print results
		System.out.println("The square root of " + input + " is " + result);
		System.out.println("\n\n\n ");
		
	}

	
	

	public static void problem03() {
		
		//import scanner
		Scanner inkey = new Scanner(System.in);
		
		System.out.println("Lets create a triangle! \n"
				+ "Start by entering some lengths . . .\n");
		
		//prompt user
		System.out.print("Length A: ");
		//store input
		double lA = inkey.nextDouble();
		
		//prompt user
		System.out.print("Length B: ");
		//store input
		double lB = inkey.nextDouble();
		
		//squares length A and stores it in lAsq
		double lAsq = Math.pow(lA, 2);
		//squares length B and stores it in lBsq
		double lBsq = Math.pow(lB, 2);
		
		//adds length A and length B squared and  square roots it
		double hypo = Math.sqrt(lAsq + lBsq);
		
		//print results
		System.out.println("Hypotenuse = " + hypo);
		System.out.println("\n\n\n ");
		
		
		

	}


	
	
	public static void problem04() {
		
		//import scanner
		Scanner inkey = new Scanner(System.in);
		
		// declare variables
		
		//starts loop
		double input = 0.1;
		double min = 0;
		double max = 0;
		
		//starts loop
		while (input != 0) {
			
			//prompt user
			System.out.print("Enter an integer: ");
			//store input
			input = inkey.nextDouble();
			
			// if input is greater than max (0)
			 if(input > max) {
				 // store it in max
				 max = input;
			 }
			 //if input is less than max (0)
			 else if (input < min ) {
				 //store it in max
				 min = input;
			 }
		}
		//print results
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
	
	
	
	
}

