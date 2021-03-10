import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, max;
		String result = "Result: ";
		Scanner numScanner = new Scanner(System.in);
		
		System.out.print("Please input two integer numbers:");
		
		num1 = numScanner.nextInt();
		num2 = numScanner.nextInt();
		
		max = 1;
		
		for(int i = 2; i<=num1;i++) {	
			if(num1%i==0 && num2 %i==0) {
				max = i;
			}
		}
		
		result += String.format("the least common multiple is %d",max);
		System.out.println(result);
	}

}
