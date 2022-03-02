package labs;

import java.util.Scanner;



public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inkey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input = inkey.nextInt();
		System.out.println("");
		
		System.out.print("Enter another positive integer: ");
		int input2 = inkey.nextInt();
		System.out.println("");
		
		double result = Math.pow(input, input2);
		int actresult = (int) result;
		
		System.out.println(input + "^" + input2 + " = " + result);
		
		System.out.println("\n\n\n ");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inkey = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: " );
		double input = inkey.nextDouble();
		System.out.println("");
		
		double result = Math.sqrt(input);
		
		System.out.println("The square root of " + input + " is " + result);
		System.out.println("\n\n\n ");
		
	}

	
	

	public static void problem03() {
		
		Scanner inkey = new Scanner(System.in);
		
		System.out.println("Lets create a triangle! \n"
				+ "Start by entering some lengths . . .\n");
		
		System.out.print("Length A: ");
		double lA = inkey.nextDouble();
		System.out.print("Length B: ");
		double lB = inkey.nextDouble();
		
		double lAsq = Math.pow(lA, 2);
		double lBsq = Math.pow(lB, 2);
		
		double hypo = Math.sqrt(lAsq + lBsq);
		
		System.out.println("Hypotenuse = " + hypo);
		System.out.println("\n\n\n ");
		
		
		

	}


	
	
	public static void problem04() {
		
		Scanner inkey = new Scanner(System.in);
		double input = 0.1;
		double min = 0;
		double max = 0;
		
		while (input != 0) {
			System.out.print("Enter an integer: ");
			input = inkey.nextDouble();
			
			 if(input > max) {
				 max = input;
			 }
			 else if (input < min ) {
				 min = input;
			 }
			
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

