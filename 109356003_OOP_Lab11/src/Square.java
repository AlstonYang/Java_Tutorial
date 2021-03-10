
public class Square implements Shape {

	private double side;
	private double area;
	private double perimeter;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		this.area = side*side;
	}

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		this.perimeter = side*4;

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
