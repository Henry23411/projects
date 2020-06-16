package com.uoft.henry.javatest;
import java.util.Scanner;

public class options_pricing {
	
	public static void main(String args[]) {
		double S, X, t, q, r, stdev;
		try (Scanner scan = new Scanner (System.in)) {
			System.out.print("Enter option type (call/put): ");
			String option = scan.nextLine();
			option = option.toLowerCase();
			
			System.out.print("Underlying Price: ");
			S = scan.nextDouble();
			
			System.out.print("Strike Price: ");
			X = scan.nextDouble();
			
			System.out.print("Time to exprations (in years): ");
			t = scan.nextDouble();
			
			System.out.print("Dividend Yield (compounded continuously): ");
			q = scan.nextDouble();
			
			System.out.print("Annual Risk Free Rate: ");
			r = scan.nextDouble();
			
			System.out.print("Annualized Volatility: ");
			stdev = scan.nextDouble();
			
			if (option.equals ("call")) {
				double call_price = options_calculations.call_calc (S, X, t, q, r, stdev);
				System.out.print("Option Price is: " + call_price);	
			}
			
			else if (option.equals("put")) {
				double put_price = options_calculations.put_calc (S, X, t, q, r, stdev);
				System.out.print("Option Price is: " + put_price);
			}

		}
	}
}
