
public class ItemB extends Item {

	private double fixedCost;
	
	public ItemB(int itemID, double unitCost, double fixedCost, double weight) {
		
		super(itemID, unitCost, weight);
		this.fixedCost = fixedCost;
	}

	
	public double getFixedCost() {
		
		return this.fixedCost;
	}
	
	public void calcUnitPrice() {
		
		this.setUnitPrice(this.getWeight()*this.getUnitCost());
	}

}
