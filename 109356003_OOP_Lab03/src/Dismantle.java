import java.util.Scanner;

public class Dismantle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int days_of_month = 30;
		byte a;
		short b;
		a = (byte)days_of_month;
		b = (short)days_of_month;
		
		
		int num, hundred, ten, unit;
		 
		System.out.print("Please enter a three-digit number:");
		Scanner numScanner = new Scanner(System.in);
		num = numScanner.nextInt();
		
		hundred = num / 100;
		num -= hundred*100;
		ten = num / 10;
		unit = num % 10;
		
		System.out.printf("The sum is: %d\n", hundred+ten+unit);
		System.out.printf("The product is: %d\n", hundred*ten*unit);
		System.out.printf("The difference is: %d\n", hundred-ten-unit);
	}

}
