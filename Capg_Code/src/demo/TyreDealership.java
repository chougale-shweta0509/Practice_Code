package demo;

import java.util.Scanner;

public class TyreDealership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int num = sc.nextInt();
		
		int[] cars = new int[num];
		int[] bikes = new int[num];
		
		//read the no of bike and car
		for(int i = 0; i < num; i++) {
			System.out.println("Enter the number of dealerships "+ (i + 1) + ":");
			cars[i] = sc.nextInt();
			bikes[i] = sc.nextInt();
			
		}
			
		//printing output
		System.out.println("\n Total no. of " + num + " dealerships");
		
		for(int i = 0; i < num; i++) {
			int totaltyers = calculateTyre(cars[i], bikes[i]);
			System.out.println("dealer "+ (i + 1)+ " contains cars: "+cars[i]+ " and bikes: "+bikes[i]);
			System.out.println("total no. of dealer : "+(i + 1)+ " is " + cars[i]+" * 4"+ " + "+ bikes[i]+ " * 2 = " + totaltyers);
		}
		
	}

	private static int calculateTyre(int cars,  int bikes) {
		
		return (cars * 4) + (bikes * 2);
	}

}
