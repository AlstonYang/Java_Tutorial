import java.util.Scanner;

public class Triangle {

	double sideA, sideB, sideC, angleC, area, angleA, angleB;
	int perimeter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();

		System.out.print("Please enter the length of the two sides of the triangle: ");
		Scanner sideScanner = new Scanner(System.in);
		triangle.sideA = sideScanner.nextInt();
		triangle.sideB = sideScanner.nextInt();
		System.out.print("Please enter the angle of the triangle: ");
		Scanner angleScanner = new Scanner(System.in);
		triangle.angleC = angleScanner.nextInt();
		triangle.sideC = triangle.side(triangle.sideA, triangle.sideB, triangle.angleC);
		triangle.perimeter = triangle.perimeter(triangle.sideA, triangle.sideB, triangle.sideC);
		triangle.area = triangle.area(triangle.perimeter, triangle.sideA, triangle.sideB, triangle.sideC);
		triangle.angleA = triangle.angle(triangle.sideB, triangle.sideC, triangle.sideA);
		triangle.angleB = triangle.angle(triangle.sideA, triangle.sideC, triangle.sideB);

		System.out.printf("The other side length is %.0f \n", triangle.sideC);
		System.out.printf("The perimeter of the triangle is %d \n", triangle.perimeter);
		System.out.printf("The area of the triangle is %.2f \n", triangle.area);
		System.out.printf("The opposite angle of sideA(length(s):%.2f) in the triangle is %.0f degrees\n",
				triangle.sideA, triangle.angleA);
		System.out.printf("The opposite angle of sideB(length(s):%.2f) in the triangle is %.0f degrees\n",
				triangle.sideB, triangle.angleB);
	}

	public double side(double sideA, double sideB, double angleC) {

		double sideC;
		sideC = Math
				.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC)));

		return sideC;
	}

	public int perimeter(double sideA, double sideB, double sideC) {

		int perimeter = 0;
		perimeter += sideA;
		perimeter += sideB;
		perimeter += sideC;

		return perimeter;
	}

	public double area(int perimeter, double sideA, double sideB, double sideC) {

		double s, area;
		s = perimeter / 2;
		area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}

	public double angle(double side1, double side2, double side3) {

		double cos, angle;
		cos = (Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2);
		angle = Math.toDegrees(Math.acos(cos));
		return angle;
	}

}
