
public class Rectangle extends Shape {

	private double length, width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		this.setType("Rectangle");
		this.calculateArea();
		this.calculatePerimeter();
	}
	
	public void calculateArea() {
		
		this.setArea(this.length*this.width);
	}
	
	public void calculatePerimeter() {
		
		this.setPerimeter(2*(this.length+this.width));
	}
	
}
