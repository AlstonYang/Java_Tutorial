import java.util.ArrayList;

public class Order {

	private int orderID;
	private ArrayList <Item>items ;
	private ArrayList <Double> quantity;
	private Customer customer;
	private double totalCost, shippingCost, shippingWeight;
	private String status;
	
	public Order(int orderID, Customer customer) {
		
		this.orderID = orderID;
		this.customer = customer;
		this.items = new ArrayList <Item>();
		this.quantity = new ArrayList <Double>();
		this.status = "Unpaid";
	}
	

	public void calcTotalCost() {
		
		this.totalCost = 0;
		
		for (int i=0; i<items.size(); i++) {
			
			if (items.get(i) instanceof ItemB) {
				
				ItemB newItem = (ItemB)items.get(i);
				totalCost += (newItem.getFixedCost() + newItem.getUnitPrice()*this.quantity.get(i));
				
			}else {
				
				totalCost += items.get(i).getUnitPrice() * quantity.get(i);
			}
		}
		totalCost+=shippingCost;
	}
	
	public void calcShippingCosts(double unitShippingCost) {
		
		this.shippingCost = this.shippingWeight*unitShippingCost;
	}
	
	public void calcShippingCosts(int freeWeight, double unitShippingCost) {
		
		if (this.shippingWeight <= freeWeight) {
			this.shippingCost = 0;
		}else {
			this.shippingCost = (this.shippingWeight-freeWeight)*unitShippingCost;
		}
	}
	
	public void procure(Item item, double num) {
		
		if(item.getStock()-num >=0) {
			if (this.items.contains(item)) {
				
				double newQuantity = this.quantity.get(this.items.indexOf(item)) + num;
				this.quantity.set(this.items.indexOf(item), newQuantity);
				
			}else {
				
				this.items.add(item);
				this.quantity.add(num);
			}
			
			shippingWeight += item.getWeight()*num;
			item.updateStock(num);
		
		}else {
			
			System.out.println("Can't meet your needs.");
		}
	}
	
	public void update(Item item, double num) {
		
		double difference = num - this.quantity.get(this.items.indexOf(item));
		
		if (this.items.contains(item) && item.getStock()-difference>=0) {
				
			this.quantity.set(this.items.indexOf(item), num);
			shippingWeight += item.getWeight()*difference;
			
			item.updateStock(difference);
			
		}else {
			
			System.out.println("Can't meet your needs.");
		}
	}
	
	public void delete(Item item) {
		
		if (this.items.contains(item)) {
			
			int index =  this.items.indexOf(item);
			this.items.remove(item);
			
			double cancelWeight = item.getWeight()*quantity.get(index);
			shippingWeight -= cancelWeight;
			
			item.updateStock(-1*quantity.get(index));
			this.quantity.remove(index);
		}else {
			
			System.out.println("You did not order this product.");
		}
	}
	
	public String getInfo() {

		this.calcTotalCost();
		return String.format("[Order ID:%d, Total Cost:%.2f (include shipping cost:%.2f), Status:%s]\n", 
									this.orderID, this.totalCost, this.shippingCost, this.status);
	}
	
	public void checkout() {
		
		this.calcTotalCost();
		boolean result = customer.payment(this.totalCost);
		
		if(result) {
			this.status = "Paid";
		}
	}
}
