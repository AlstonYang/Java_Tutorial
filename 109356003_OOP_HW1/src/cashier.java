import java.util.Scanner;

public class cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtyApple, qtyBanana, qtyOrange, qtyKiwi, Total, Payment, Balance;
		Scanner itemScanner
		= new Scanner(System.in);
		System.out.print("***cashier***");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Please enter the quantity of apple($NT 10 per unit) you purchased:");
		qtyApple = itemScanner.nextInt();
		System.out.print("Please enter the quantity of banana($NT 15 per unit) you purchased:");
		qtyBanana = itemScanner.nextInt();
		System.out.print("Please enter the quantity of orange($NT 13 per unit) you purchased:");
		qtyOrange = itemScanner.nextInt();
		System.out.print("Please enter the quantity of kiwi($NT 17 per unit) you purchased:");
		qtyKiwi = itemScanner.nextInt();

		Total = (qtyApple * 10) + (qtyBanana * 15) + (qtyOrange * 13) + (qtyKiwi * 17);
		System.out.printf("The total cost:%d", Total);

		System.out.print("\n");
		System.out.print("Please enter payment amount (must be above total cost):");
		Payment = itemScanner.nextInt();

		Balance = Payment - Total;
		System.out.printf("Amount to be changed:%d", Balance);
		System.out.print("\n");
		
		int NT100, NT50, NT10, NT5, NT1, Remainder;
		System.out.print("The amount of each change is as follows:");
		System.out.print("\n");
		NT100 = Balance / 100;
		System.out.printf("$NT100:%d", NT100);
		Remainder = Balance % 100;
		System.out.print("\n");
		NT50 = Remainder / 50;
		System.out.printf("$NT50:%d", NT50);
		Remainder = Remainder % 50;
		System.out.print("\n");
		NT10 = Remainder / 10;
		System.out.printf("$NT10:%d", NT10);
		Remainder = Remainder % 10;
		System.out.print("\n");
		NT5= Remainder / 5;
		System.out.printf("$NT5:%d", NT5);
		Remainder = Remainder % 5;
		System.out.print("\n");
		NT1= Remainder / 1;
		System.out.printf("$NT1:%d", NT1);

	}

}
