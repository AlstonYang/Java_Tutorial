import java.util.Scanner;

public class Arithmetic {

	private int num1, num2, num3, sum, min, max1, max2;
	
	public Arithmetic(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
		this.sum = num1 + num2;
		this.min();
		this.topTwoValue();
		
	}
	
	public Arithmetic(int num1, int num2, int num3) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.sum = num1+num2+num3;
		this.min();
		this.topTwoValue();
	}
	
	public int getMax1() {
		
		return max1;
	} 
	
	public int getMax2() {
		
		return max2;
	} 
	
	public void min() {
		
		min = Math.min(num1, Math.min(num2, num3));
	}
	
	public double topTwoAvg() {
		
		return (double)(sum - min)/2;
	
	}
	
	public void topTwoValue() {
		
		if(num1 != min && num2 != min) {
			max1 = num1;
			max2 = num2;
		}else if(num2 != min && num3 != min) {
			max1 = num2;
			max2 = num3;
		}else if(num1 != min && num3 != min) {
			max1 = num1;
			max2 = num3;
		}
	}
	
	public int topTwoLMC() {
		int hcf;
		hcf = 1;
		
		for(int i =1; i<=max1; i++) {
			if(max1 %i ==0 && max2 %i ==0) {
				hcf = i;
			}
		}
		
		return max1*max2/hcf;
	}
	
	
}
