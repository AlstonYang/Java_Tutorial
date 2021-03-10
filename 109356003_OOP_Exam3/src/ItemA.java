
public class ItemA extends Item {

	private double tariff;
	
	public ItemA(int itemID, double unitCost, double tariff, double weight) {
		
		super(itemID, unitCost, weight);
		this.tariff= tariff;
		this.calcUnitPrice();
	}
	
	public void calcUnitPrice() {
		
		this.setUnitPrice(this.getUnitCost() + this.tariff);
	}
}
