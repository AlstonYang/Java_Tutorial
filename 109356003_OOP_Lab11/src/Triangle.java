
public class Triangle implements Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	private double area;
	private double perimeter;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		double p;
		p = (this.sideA+this.sideB+this.sideC)/2;
		this.area = Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC)); 
	}

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		this.perimeter = this.sideA+this.sideB+this.sideC;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.perimeter;
	}

}
