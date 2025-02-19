import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
	
	
	final static byte MonthsInYear = 12;
	final static byte percent = 100;

	
	public static void main(String[] args) {

		int principal = (int) readNumber("Desired Loan Amount($1k-$1M):", 1000, 1000000);
		float annualInterest = (float) readNumber("Annual Interest Rate:", 1, 30);
		byte years = (byte) readNumber("Period(Years):", 1, 30);

		printMortgage(principal, annualInterest, years);

		printPaymentSchedule(principal, annualInterest, years);
	}

	public static void printMortgage(int principal, float annualInterest, byte years) {
		double mortgage = calculateMortgage(principal, annualInterest, years);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGATE");
		System.out.println("-----------");
		System.out.print("Monthly Payments: " + mortgageFormatted);
	}

	public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE :");
		System.out.println("-----------");
		for (short month = 1; month <= years * MonthsInYear; month++) {
			double balance = calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

	public static double calculateMortgage(
			int principal, 
			float annualInteres, 
			byte years) {

		float monthlyInterest = annualInteres / percent / MonthsInYear;
		short numberOfPayments = (short) (years * MonthsInYear);
		double mortgae = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
		return mortgae;
	}

	public static double calculateBalance(
			int principal, 
			float annualInteres, 
			byte years, 
			short numberofPaymentsMade) {

		float monthlyInterest = annualInteres / percent / MonthsInYear;
		short numberOfPayments = (short) (years * MonthsInYear);

		double balance = principal
				* (Math.pow(1 + monthlyInterest, numberOfPayments)
						- Math.pow(1 + monthlyInterest, numberofPaymentsMade))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

		return balance;

	}

	public static double readNumber(
			String principal, 
			double min,
			double max) {
		Scanner scanner = new Scanner(System.in);
		double value;
		while (true) {
			System.out.print(principal);
			value = scanner.nextFloat();

			if (value >= min && value <= max)
				break;

			System.out.println("Enter a Number Between" + min + "&" + max);

		}
		return value;

	}

}
