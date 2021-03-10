import java.util.Scanner;

public class Circle {

	double radius, x, y, area, circumference;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double radius1, x1, y1, area1, circumference1, radius2, area2, circumference2;
		double x, y;
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Please input the radius of the circle1: ");
		circle1.radius = inputScanner.nextDouble();

		System.out.print("Please enter xy-coordinate of center for the circle1 (separated by spaces): ");
		circle1.x = inputScanner.nextDouble();
		circle1.y = inputScanner.nextDouble();

		circle2.radius = 5;
		circle2.x = 0;
		circle2.y = 0;

		System.out.print("please enter the xy-coordinate of the point: ");
		x = inputScanner.nextDouble();
		y = inputScanner.nextDouble();

		circle1.area = circle1.area(circle1.radius);
		circle1.circumference = circle1.circumference(circle1.radius);
		System.out.printf("The area of the circle1 is %.2f\n", circle1.area);
		System.out.printf("The circumference of the circle1 is %.2f\n", circle1.circumference);
		circle1.rangePoint(circle1.radius, circle1.x, circle1.y, x, y);
		circle1.rangeCircle(circle1.radius, circle1.x, circle1.y, circle2.radius, circle2.x, circle2.y);
	}

	public double area(double radius) {

		double area;
		area = radius * radius * Math.PI;

		return area;
	}

	public double circumference(double radius) {
		double circumference;
		circumference = radius * 2 * Math.PI;
		return circumference;
	}

	public void rangePoint(double radius, double circle_x, double circle_y, double x, double y) {

		double distance;
		distance = Math.sqrt((x - circle_x) * (x - circle_x) + (y - circle_y) * (y - circle_y));

		System.out.print("The relationship between point and circle:");

		if (distance < radius) {
			System.out.println("the point inside the circle.");
		} else if (distance == radius) {
			System.out.println("the point on the circle.");
		} else {
			System.out.println("the point outside the circle.");

		}
	}

	public void rangeCircle(double radius1, double circle_x1, double circle_y1, double radius2, double circle_x2,
			double circle_y2) {

		double distance;
		distance = Math.sqrt(
				(circle_x1 - circle_x2) * (circle_x1 - circle_x2) + (circle_y1 - circle_y2) * (circle_y1 - circle_y2));

		System.out.print("The relationship between the two circles:");

		if (distance < radius1 - radius2 && radius1 >= radius2) {
			System.out.println("the centre of one circle lies on the other circle.");
		} else if (distance < radius2 - radius1 && radius1 <= radius2) {
			System.out.println("the centre of one circle lies on the other circle.");
		} else if (distance == radius2 - radius1) {
			System.out.println("two circles are concentric.");
		} else if (distance < radius2 + radius1 && distance > radius2 - radius1 && radius1 <= radius2) {
			System.out.println("two circles intersect at two points.");
		} else if (distance < radius2 + radius1 && distance > radius1 - radius2 && radius1 >= radius2) {
			System.out.println("two circles intersect at two points.");
		} else if (distance == radius2 + radius1) {
			System.out.println("the circles touch externally.");
		} else {
			System.out.println("the circles do not touch or intersect each other.");
		}
	}
}
