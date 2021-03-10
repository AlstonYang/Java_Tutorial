
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square square = new Square(8);
		Circle circle = new Circle(6);
		Triangle triangle= new Triangle(3,4,5);
		
		Shape[] shapes = {square, circle, triangle};
		
		for (Shape shape : shapes) {
			System.out.println(presentResult(shape));
		}
	}

	public static String presentResult(Shape shape) {
		
		return String.format("%s [%s]", shape.getType(), shape.toString());
	}
}
