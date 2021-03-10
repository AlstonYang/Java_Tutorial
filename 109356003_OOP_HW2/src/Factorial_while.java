import java.util.Scanner;

public class Factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, result=1, count=1;
		Scanner numScanner = new Scanner(System.in);
		
		System.out.print("Please input a factorial number:");
		num = numScanner.nextInt();
		
		
		
		while(count <= num) {
			
			result *= count;
			count++;
			
		}
		
		System.out.printf("The result is: %d",result);
		
	}
}
