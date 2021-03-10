
public class Item {

	private int itemID;
	private double stock, unitPrice, unitCost, weight;
	
	public Item(int itemID, double unitCost, double weight) {
		
		this.itemID = itemID;
		this.unitCost = unitCost;
		this.weight = weight;
		this.calcUnitPrice();
	}
	
	public void setStock(double amount) {
		
		this.stock = amount;
	}
	
	public void setUnitPrice(double unitPrice) {
		
		this.unitPrice = unitPrice;
	}
	
	public void updateStock(double amount) {
		
		this.stock -= amount;
	}
	
	public double getStock() {
		
		return this.stock;
	}
	
	public double getWeight() {
		
		return this.weight;
	}
	
	public double getUnitCost() {
		
		return this.unitCost;
	}
	
	public double getUnitPrice() {
		
		return this.unitPrice;
	}
	
	public void calcUnitPrice() {
		
		this.unitPrice = this.unitCost;
	}

	public String getInfo() {
		
		return String.format("[Item id:%d, Price:%.2f, Inventory level:%.2f, Weight:%.2f]\n", 
								this.itemID, this.unitPrice, this.stock ,this.weight);
	}
}
