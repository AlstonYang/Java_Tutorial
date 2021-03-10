
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		"<<florida>>"
		Shape square1 = new Square(10);
		Shape circle1 = new Circle(5);
		Shape triangle1 = new Triangle(3,4,5);
		
//		<<Used for test>>
//		square1.caclArea();
//		System.out.println(square1.getArea());
//		
//		circle1.caclArea();
//		System.out.println(circle1.getArea());
//		
//		triangle1.caclArea();
//		System.out.println(triangle1.getArea());
		
		Land florida = new Land(1, 30000);
		florida.addArea(square1);
		florida.addArea(circle1);
		florida.addArea(triangle1);
		florida.calcTotalValue();
		System.out.println("<<Florida>>");
		System.out.println(florida.getInfo());
		
		System.out.println();
//		<<Indiana>>
		Land indiana = new Land(2, 17000);
		
		Shape square2 = new Square(5);
		Shape circle2 = new Circle(7);
		Shape triangle2 = new Triangle(6,6,6);
		
//		<<Used for test>>
//		square2.caclArea();
//		System.out.println(square2.getArea());
//		
//		circle2.caclArea();
//		System.out.println(circle2.getArea());
//		
//		triangle2.caclArea();
//		System.out.println(triangle2.getArea());
		
		indiana.addArea(square2);
		indiana.addArea(circle2);
		indiana.addArea(triangle2);
		indiana.calcTotalValue();
		System.out.println("<<Indiana>>");
		System.out.println(indiana.getInfo());
		
	}

}
