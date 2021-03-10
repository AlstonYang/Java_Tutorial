
public class Triangle extends Shape {

	private double sideA, sideB, sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.setType("Triangle");
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	public void calculateArea() {
		
		double s = (this.sideA+this.sideB+this.sideC)/2;
		this.setArea(Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC)));
	}
	
	public void calculatePerimeter() {
		
		this.setPerimeter(this.sideA+this.sideB+this.sideC);
	}
	
}
