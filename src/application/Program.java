package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		System.out.println();
		
		InterestService brazilInterestService = new BrazilInterestService(2.0);
		double brazilPayment = brazilInterestService.payment(amount, months);
		
		InterestService usaInterestService = new UsaInterestService(1.0);
		double usaPayment = usaInterestService.payment(amount, months);
				
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("Brazil: %.2f", brazilPayment));
		System.out.println();
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("USA: %.2f", usaPayment));
		
		sc.close();
	}
}
