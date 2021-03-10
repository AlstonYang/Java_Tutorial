import java.util.Scanner;

public class Tester{
	
	public static void main(String[] arg) {
		
		System.out.println("(Bonus2)");
		
		int num1, num2, num3;
		System.out.print("Please enter two numbers (seperated by space):");
		Scanner inputScanner = new Scanner(System.in);
		
		num1 = inputScanner.nextInt();
		num2 = inputScanner.nextInt();
		
		Arithmetic arith1 = new Arithmetic(num1, num2);
		arith1.topTwoValue();
		System.out.printf("The top two largest numbers are: %d, %d\n", arith1.getMax1(), arith1.getMax2());
		System.out.printf("The average of the two numbers: %.2f\n",arith1.topTwoAvg());
		System.out.printf("The LMC of the two numbers:%d\n\n",arith1.topTwoLMC());
		
		System.out.print("Please enter two numbers (seperated by space):");
		
		num1 = inputScanner.nextInt();
		num2 = inputScanner.nextInt();
		num3 = inputScanner.nextInt();
		
		Arithmetic arith2 = new Arithmetic(num1, num2, num3);
		arith2.topTwoValue();
		System.out.printf("The top two largest numbers are: %d, %d\n", arith2.getMax1(), arith2.getMax2());
		System.out.printf("The average of the two numbers: %.2f\n",arith2.topTwoAvg());
		System.out.printf("The LMC of the two numbers:%d",arith2.topTwoLMC());
	}
	
}