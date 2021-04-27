import java.util.ArrayList;

public class Membership {

	private int ID;
	private ArrayList<Order> orderList;
	private double totalSpending;
	private boolean isVIP;
	
	public Membership(int ID) {
		
		this.ID = ID;
		orderList = new ArrayList<Order>();
		isVIP = false;
	}
	
	public boolean getIsVIP() {
		
		return this.isVIP;
	}
	
	public void buy(int orderID, Item item, int num) {
		
		for(Order order:orderList) {
			if(order.getID() == orderID) {
				order.addItem(item, num);
				break;
			}
		}
	}
	
	public int buy(Item item, int num) {
		
		Order order = new Order(orderList.size());
		this.orderList.add(order);
		order.addItem(item, num);
		return order.getID();
	}
	
	public String checkOut(int orderID) {
		
		for(Order order:orderList) {
			if(order.getID() == orderID) {
				this.totalSpending += order.getOrderTotal();
				return order.placeOrder(this.isVIP);
			}
		}
		return "Error 1";
	}
	
	public void yearEnd() {
		
		if(this.totalSpending > 5000) {
			this.isVIP = true;
		}else {
			this.isVIP = false;
		}
		this.totalSpending = 0;
		orderList = new ArrayList<Order>();
	}
}
