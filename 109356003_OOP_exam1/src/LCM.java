import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, hcf;
		hcf = 1;
		System.out.print("Please input two numbers: ");
		Scanner numScanner = new Scanner(System.in);
		
		num1 = numScanner.nextInt();
		num2 = numScanner.nextInt();
		
		for(int i =1; i<=num1; i++) {
			if(num1 %1 ==0 && num2 %1 ==0) {
				hcf = i;
			}
		}
		
		System.out.printf("The least common multiple: %d", num1*num2/hcf);
	}

}
