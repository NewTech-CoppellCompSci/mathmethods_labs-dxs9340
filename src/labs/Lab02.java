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
		
		Scanner inKey = new Scanner(System.in);

		System.out.print("Enter an "
				+ "positive integer: ");
		int input = inKey.nextInt();
		
		System.out.print("Enter another"
				+ " positive integer: ");
		int input2 = inKey.nextInt();
		
		int max = Math.max(input, input2);
		int min = Math.min(input, input2);
		int scope = max - min + 1;
		
		for(int i = 1; i <= 10; i++) {
			
			int num = (int) (Math.random() * scope + min);
			System.out.print(num + " ");
		}
			System.out.println("\n\n");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = inKey.nextInt();
		
		System.out.print("Enter the height: ");
		double height = inKey.nextInt();
		
		double vol = (Math.PI) * 
			(Math.pow(radius, 2)) * height;
		
		System.out.println("The cylinders "
				+ "volume is " + vol);

	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);

		System.out.print("Enter x value 1: ");
		double x1 = inKey.nextInt();
		
		System.out.print("Enter y value 1: ");
		double y1 = inKey.nextInt();
		
		System.out.print("Enter x value 2: ");
		double x2 = inKey.nextInt();
		
		System.out.print("Enter y value 2: ");
		double y2 = inKey.nextInt();
		
		double sect1 = (Math.pow((x2 - x1), 2));
		double sect2 = (Math.pow((y2 - y1), 2));
		
		double dist = Math.sqrt(sect1 + sect2);
		
		System.out.println("The "
				+ "distance between\n(" + x1 + "," +y1 + ")"
						+ " and (" + x2 + "," + y2 + ")"
								+ " is " + dist);

		
		
	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = inKey.nextInt();
		
		System.out.print("Enter b: ");
		double b = inKey.nextInt();
		
		System.out.print("Enter c: ");
		double c = inKey.nextInt();
				
		double sect1 = (b * -1)+ 
				Math.sqrt(Math.pow(b, 2) - 4 * (a*c) );
		double sect2 = (b * -1) - 
				Math.sqrt(Math.pow(b, 2) - 4 * (a*c) );
		double sect3 = 2 * a ;
		
		double x1 = sect1/sect3 ;
		double x2 = sect2/sect3 ;
		
		System.out.println("x1 = " + x1);
		System.out.print("x2 = " + x2);
		
	}
	
	

	
}
