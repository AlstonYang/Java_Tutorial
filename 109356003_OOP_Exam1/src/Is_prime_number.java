
public class Is_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result ="";
		for(int i =2; i<=100; i++) {
			boolean isprime = true;
			
			if(i==2) {
				isprime = true;
				result += i;
			}
			
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
						isprime = false;
					}
			}
			
			if(i>=3 && isprime == true) {
				result += ", "+i;
			}
			
		}
		System.out.printf("The prime numbers among 1~100: %s", result);
	}

}


