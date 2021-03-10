import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount accountA = new SavingsAccount(8000, 306049001, 1);
		SavingsAccount accountB = new SavingsAccount(1000, 306049011, 2);
		CheckingAccount accountC = new CheckingAccount(9000, 306016033);
		CheckingAccount accountD = new CheckingAccount(3000, 306016041);

		
		BankAccount [] accounts =  {accountA, accountB, accountC, accountD};
		
		Scanner in  = new Scanner(System.in);
		
		boolean done= false;
		
		while(!done) {
			
			System.out.print("D)Deposit  W)Withdraw  M)Month end  Q)Quit:");
			
			String input = in.next();
			if (input.equals("D") || input.equals("W")) {
				
				System.out.print("Enter your account number:");
				int accountNumber = in.nextInt();
				System.out.print("Enter transaction amount:");
				double amount = in.nextDouble();
				
				
				for (int i=0; i<accounts.length; i++) {
					
					if (accounts[i].getID() == accountNumber) {
						BankAccount operatedAccount=accounts[i];
					
						if(input.equals("D")) {
							operatedAccount.deposit(amount);
						}else {
							operatedAccount.withdraw(amount);
						}
						System.out.println("Balance: " + operatedAccount.getBalance());
						break;
					}
					
					else if(i == (accounts.length-1)) {	
						
						System.out.println("Corresponding account cannot found.");
					}
					
				}		
			}else if(input.equals("M")) {
				
				for (int n =0; n<accounts.length; n++) {
					
					accounts[n].monthEnd();
					System.out.println(n+" "+accounts[n].getBalance());
				}
			}
			
			else if(input.equals("Q")) {
				done = true;
			}
		}
		
	}

}
