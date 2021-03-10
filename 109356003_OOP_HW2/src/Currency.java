import java.util.Scanner;

public class Currency {
	
	public static void main(String[] args) { 
		
		String currency;
		double value;
		Scanner cyScanner = new Scanner(System.in);
		
		System.out.print("Convert from TWD, USD, JPY:");
		currency = cyScanner.next();
		System.out.print("Value:");
		value = cyScanner.nextDouble();

		System.out.print("The result:");
		
		if(currency.equals("TWD")) {
			System.out.printf("%.2f TWD = %.2f USD = %.2f JPY", value, value*0.034, value*3.568);
		}else if(currency.equals("USD")) {
			System.out.printf("%.2f USD = %.2f TWD = %.2f JPY", value, value*(1/0.034), value*(3.568/0.034));
		}else {
			System.out.printf("%.2f JPY = %.2f TWD = %.2f USD", value, value*(1/3.568), value*(0.034/3.568));
		}
	}
}
