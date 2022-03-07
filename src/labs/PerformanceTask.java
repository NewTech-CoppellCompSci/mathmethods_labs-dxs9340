package labs;
import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		tshirttrajectory2();
		
		
	}
	
	public static void tshirttrajectory2() {
		
		//import scanner
		Scanner inKey = new Scanner(System.in);
				
		//prompt user
		System.out.print("Enter launch velocity (m/s): ");
		//store input
		int velocity = inKey.nextInt();
				
		//prompt user
		System.out.print("Enter launch angle (degrees): \n\n");
		//store input
		double langle = inKey.nextInt();
		
		//declare variables
		double time = 0;
		double xPosition = 0;
		double yPosition = 0;
		
		//start loop, while y position is > or = to 0
		while (yPosition >= 0) {
		
			// print time
			System.out.print("Time: " + (int)time + "s \n");

			//find x and y positions. cosine of the radian value of the launch angle
			// x position  * time * velocity
			//y position * time * velocity - 0.5 * 9.8 * time * time
			xPosition = Math.cos(Math.toRadians(langle)) * time * velocity;
			yPosition = Math.sin(Math.toRadians(langle)) * 
					time * velocity - 0.5 * 9.8 * time * time;	
			
			//print x position
			System.out.println("x-pos: " + xPosition + "m");
			
			// if statement to print y position and when the shirt hits the ground
			if (yPosition >= 0) {
			System.out.println("y-pos: " + yPosition + "m\n");
			}
			else {
				System.out.println("y-pos: 0m");
			}
		
			//increment time
			time++;
			}
				
			}
			

		}
		
	
	
























