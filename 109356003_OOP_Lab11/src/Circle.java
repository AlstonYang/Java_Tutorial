
public class Circle implements Shape {
	
	private final double PI;
	private double radius;
	private double area;
	private double perimeter;
	
	public Circle(double radius) {
		PI = 3.14;
		this.radius = radius;
	}

	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		this.area = radius*radius*PI; 
	}

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		this.perimeter = 2*radius*PI;
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
