import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, result=1;
		Scanner numScanner = new Scanner(System.in);
		
		System.out.print("Please input a factorial number:");
		num = numScanner.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			result *= i;
		}
		
		System.out.printf("The result is: %d",result);
		
	}

}
