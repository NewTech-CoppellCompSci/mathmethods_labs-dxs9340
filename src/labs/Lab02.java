package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		//import scanner
		Scanner inKey = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter an "
				+ "positive integer: ");
		//store input
		int input = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter another"
				+ " positive integer: ");
		//store input
		int input2 = inKey.nextInt();
		
		// finds max of the 2 numbers
		int max = Math.max(input, input2);
		// finds minimum of the 2 numbers
		int min = Math.min(input, input2);
		// creates range and add 1 to include the number at the larger end
		int scope = max - min + 1;
		System.out.println(scope +"\n");
		System.out.println(Math.random());
		
		//cycles through 10 numbers
		for(int i = 1; i <= 10; i++) {
			//turns a random number into an number < 1, adds 
			// the min to start it off from there and 
			//turns it into a integer
			int num = (int) (Math.random() * scope + min);
			
			//print results
			System.out.print(num + " ");
		}
			System.out.println("\n\n");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		//import scanner
		Scanner inKey = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter the radius: ");
		//store input
		double radius = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter the height: ");
		//store input
		double height = inKey.nextInt();
		
		//PI times the radius squared time height
		double vol = (Math.PI) * 
			(Math.pow(radius, 2)) * height;
		
		//print results
		System.out.println("The cylinders "
				+ "volume is " + vol);

	}

	
	

	public static void problem03() {
		
		//import scanner
		Scanner inKey = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter x value 1: ");
		//store input
		double x1 = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter y value 1: ");
		//store input
		double y1 = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter x value 2: ");
		//store input
		double x2 = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter y value 2: ");
		//store input
		double y2 = inKey.nextInt();
		
		//x2 - x1 squared and stores it in sect1
		double sect1 = (Math.pow((x2 - x1), 2));
		//y2 - y1 squared and stores it in sect2
		double sect2 = (Math.pow((y2 - y1), 2));
		
		//square root of sect1 and sect2
		double dist = Math.sqrt(sect1 + sect2);
		
		//print results
		System.out.println("The distance between\n(" + x1 + "," +y1 + ")"
						+ " and (" + x2 + "," + y2 + ")"
								+ " is " + dist);

		
		
	}


	
	
	public static void problem04() {
		
		//import scanner
		Scanner inKey = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter a: ");
		//store input
		double a = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter b: ");
		//store input
		double b = inKey.nextInt();
		
		//prompt user
		System.out.print("Enter c: ");
		//store input
		double c = inKey.nextInt();
				
		//turn b negative plus square root of b square time 4ac
		double sect1 = (b * -1)+ 
				Math.sqrt(Math.pow(b, 2) - 4 * (a*c) );
		//turn b negative minus square root of b square time 4ac
		double sect2 = (b * -1) - 
				Math.sqrt(Math.pow(b, 2) - 4 * (a*c) );
		// 2 times a
		double sect3 = 2 * a ;
		
		//option 1 divided by sect3
		double x1 = sect1/sect3 ;
		//option 2 divided by sect3
		double x2 = sect2/sect3 ;
		
		//print results
		System.out.println("x1 = " + x1);
		System.out.print("x2 = " + x2);
		
	}
	
	

	
}
