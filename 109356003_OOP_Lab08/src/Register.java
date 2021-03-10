import java.util.ArrayList;

public class Register {

	private int totalRevenue;
	private ArrayList <Integer> bills;
	
	public Register() {
		totalRevenue=0;
		bills = new ArrayList <Integer>();
	}

	public int gettotalRevenue() {
		return this.totalRevenue;
	}
	
	public int getBill(int id) {
		return this.bills.get(id);
	}
	
	public void calctotalCost(int id, int num, int price) {
		
		try {
			bills.set(id, bills.get(id)+num*price);
			this.calctotalRevenue(num*price);
		}catch(IndexOutOfBoundsException e) {
			bills.add(num*price);
			this.calctotalRevenue(num*price);
		}
		
	}
				
	public void calctotalRevenue(int cost) {
		totalRevenue += cost;
	}
	
	public String getInfo() {
		String register_info = "My register info:\nBill\n";
		
		for(int bill:bills) {
			register_info += bill+"\n";
		}
		register_info += "Total Revenue:" + this.totalRevenue;
		
		return register_info;
	}

}
