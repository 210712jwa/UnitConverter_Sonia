package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		
		
		int  menuSelection=0;
		
		while  (menuSelection != 4) {
			
			System.out.println("Please select an option :");
			System.out.println("-------------------------\n");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2  Miles to Kilometers :");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4 Quit");
			
			Scanner C = new Scanner(System.in);
			
			menuSelection = C.nextInt();
			
			
			switch(menuSelection) {
			
			case 1 :
				
				System.out.println("Converting Cups to TeaSpoons");
				double amount = C.nextDouble();
				double cups = amount*48.99;
				System.out.println();
				System.out.println(amount + "Cups = "+ cups +" TeaSpoons");
				break;
				
			case 2:
				
				System.out.println("Converting Miles to KiloMeters ");
				
				double m = C.nextDouble();
				double miles= m*1.6;
				System.out.println();
				System.out.println(m+" Miles = "+miles+" KM");
				break;
				
			case 3:
				
				System.out.println("Converting US Gallon to Imperial Gallon");
				
				double u= C.nextDouble();
				double gallon= u*0.83;
				System.out.println();
				System.out.println(u +" US Gallon = "+gallon +" Imperial Gallon");
				break;
				
			case 4:
				
				System.out.println();
				System.out.println("Quit");
				break;
				
				default:
					System.out.println("Invalid Entry. Choose an option from 1 to 4 ");
					break;
		
		}
System.out.println();
	}

}
}
