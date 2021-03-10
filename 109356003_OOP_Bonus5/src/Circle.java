
public class Circle extends Shape {

	private double radius;
	final double pi = 3.14;
	
	public Circle(double radius) {
		
		this.radius = radius;
		this.setType("Circle");
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	public void calculateArea() {
		
		
		
		this.setArea(this.radius*this.radius*pi);
	}
	
	public void calculatePerimeter() {
		
		this.setPerimeter(2*this.radius*pi);
	}
	
}
