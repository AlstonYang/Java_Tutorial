import java.util.ArrayList;

public class Order {

	private int ID;
//	private Membership membership;
	private ArrayList<Item> itemList;
	private ArrayList<Integer> quantities;
	private double subTotal;
	private double totalBenefit;
	private double shippingFee;
	private double orderTotal;
	private boolean isPaid;

	public Order(int ID) {

		this.ID = ID;
//		this.membership = membership;
		this.itemList = new ArrayList<Item>();
		this.quantities = new ArrayList<Integer>();
		this.isPaid = false;
	}

	public double getOrderTotal() {

		return this.orderTotal;
	}

	public int getID() {

		return this.ID;
	}
	
	public void addItem(Item item, int num) {
		
		if (!isPaid) {
			this.itemList.add(item);
			this.quantities.add(num);
		}
	}

	public String placeOrder(boolean isVIP) {

		if (!isPaid) {
			for (int i = 0; i < itemList.size(); i++) {
	
				this.subTotal += itemList.get(i).getPrice()*this.quantities.get(i);
				int num = quantities.get(i);
				this.shippingFee += itemList.get(i).calcShippingFee(num);
				this.totalBenefit += itemList.get(i).calcDiscount(num);
			}
	
			if (isVIP) {
	
				this.totalBenefit += (this.subTotal - this.totalBenefit) * 0.2;
			}
	
			this.orderTotal = this.subTotal - this.totalBenefit +this.shippingFee;
			this.isPaid = true;
			return this.getInfo();
		
		}else {
			return "Payment completed! Thanks!";
		}
	}
	
	public String addMark() {
		
		String mark = "";
		
		for (int i=0; i<30; i++) {
			mark+="-";
		}
		return mark;
	}

	
	public String getInfo() {
		
		String info = String.format("%s\n%-11s%9s%10s\n", "Order Summary", "Item", "Price", "Quantity");
		info+= this.addMark()+"\n";
		
		for (int i = 0; i < itemList.size(); i++) {

			info += String.format("%-11d%9.2f%10d\n", itemList.get(i).getID(), itemList.get(i).getPrice(), this.quantities.get(i));
		}
		
		info+= this.addMark();
		info += String.format("\nSub total: %.2f\n%s\nDiscount: %.2f\n%s\nShipping fee: %.2f\n%s\nOrder total: %.2f\n", 
				this.subTotal, this.addMark(), this.totalBenefit, this.addMark(), this.shippingFee, this.addMark(), this.orderTotal);
		return info;
	}
}
