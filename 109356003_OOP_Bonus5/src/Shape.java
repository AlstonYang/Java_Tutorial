
public class Shape {

	private double area, perimeter;
	private String type;
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public double getPerimeter() {
		return this.perimeter;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String toString() {
		return String.format("[Area:%.2f, Perimeter:%.2f]", this.area, this.perimeter);
	}
}
