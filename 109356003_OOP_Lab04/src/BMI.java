import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight,height,bmi;
		
		Scanner valueScanner = new Scanner(System.in);
		
		System.out.print("Please input the weight(kg):");
		weight = valueScanner.nextInt();
		System.out.print("Please input the height(cm):");
		height = valueScanner.nextInt();
		
		height = height/100;
		
		bmi = (weight / Math.pow(height, 2));
		System.out.printf("Your BMI is: %.2f\n", bmi);
		
		System.out.print("The result is: ");
		if(bmi < 18.5) {
			System.out.println("underweight");
		}else if(bmi >= 24) {
			System.out.println("overweight");
		}else {
			System.out.println("normal");
		}
		
		
	}

}
