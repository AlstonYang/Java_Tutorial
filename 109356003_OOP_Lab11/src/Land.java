import java.util.ArrayList;

public class Land {

	private int id;
	private double valuePerAcre;
	private double totalArea;
	private double netValue;
	
	public Land(int id, double unitLandValue) {
		
		this.id = id;
		this.valuePerAcre = unitLandValue;
	}
	
	public void addArea(Shape shape) {
		
		shape.calcArea();
		this.totalArea += shape.getArea();
	}

	
	public void calcTotalValue() {
		
		this.netValue = this.totalArea * this.valuePerAcre;
	}
	
	public String getInfo() {
		String info ="";
		info += String.format("The area ID: %d\nValue per acre: $%.2f\nTotal area: %.2f\nTotal value: $%.2f", this.id, this.valuePerAcre, this.totalArea, this.netValue);
		return info;
	}
}
