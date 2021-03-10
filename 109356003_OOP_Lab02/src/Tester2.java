import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		System.out.print("Please input three number(use space to split): ");
		Scanner numScanner = new Scanner(System.in);
		num1 = numScanner.nextInt();		
		num2 = numScanner.nextInt();
//		
//		
//		int sum, mul;
//		double avg;
//		sum = num1+num2;
//		mul = num1*num2;
//		avg = sum/3;
//		System.out.printf("Sum: %d \n",sum);
//		System.out.printf("Mul: %d \n",mul);
//		System.out.printf("Avg: %.2f \n", avg);
//		System.out.printf("Max: %d \n", Math.max(num1, num2));
		
		
//		String fullName = "Alston Yang";
//		System.out.printf("%s %d \n",fullName,fullName.length());
//		System.out.println(fullName.substring(7));
		
		if (num1 % 2 == 0) {
			if(num2 % 2 == 0) {
				System.out.println("Both num1 and num2 are even.");
			}else {
				System.out.println("num1 is even, num2 is odd.");
			}
		}else {
			if(num2 % 2 == 1) {
				System.out.println("Both num1 and num2 are odd.");
			}else {
				System.out.println("num1 is odd, num2 is even.");
			}
			
		}
	}

}
