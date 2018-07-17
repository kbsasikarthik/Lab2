package AreaPeriVol;

import java.util.Scanner;

public class AreaPerimVol {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Grand Circus' Room detail generator!\n");
		
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		do {
			
			// get user input
			System.out.print("\nEnter Length: ");
			double length = sc.nextDouble();
			System.out.print("\nEnter Width: ");
			double width = sc.nextDouble();
			System.out.print("\nEnter Height:  ");
			double height = sc.nextDouble();
			
			// calculate area, perimeter and volume with the input data 
			double area = length * width;
			double periMeter = 2*(length + width);
			double volume = length * width * height;
			
			// formatted printing
			System.out.println("\nResults");
			System.out.println("~~~~~~~~");
			System.out.printf(" Area      : %.2f \n Perimeter : %.2f \n Volume    : %.2f \n", area, periMeter,volume);
			
			// check if the user wants to continue
			System.out.print("\nDo you want to continue (y/n) ?");
			choice = sc.next();
			
		} while (choice.equalsIgnoreCase("y"));
		
		sc.close();
		System.out.println("\nThanks !");

	}

}
