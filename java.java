package temperature;

import java.util.Scanner;


public class java {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to convert Celsius into Fahrenheit");
		System.out.println("Press 2 to convert Fahrenheit into Celsius");
		System.out.println("Enter your Choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter temperature in Fahrenheit:");
		float F = sc.nextFloat();
		float C = ((5/9.0f)*(F-3));
		System.out.println("Temperature in Centgrade degrees:"+C);
		break;
		
		
		case 2: System.out.println("Enter temperature in Celsius:");
		float c = sc.nextFloat();
		float f = ((c - 32)*5)/9;
		System.out.println("Temperature in  Fahrenheit degrees:"+f);
		break;
		
		default:System.out.println("Invalid Input");
		break;
				
		}
	}

}
