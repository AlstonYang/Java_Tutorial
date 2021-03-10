
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemA item1 = new ItemA(111, 30, 5, 3);
		ItemB item2 = new ItemB(222, 5, 100, 3);
		
		item1.setStock(50);
		item2.setStock(20);
		
		System.out.print(item1.getInfo());
		System.out.print(item2.getInfo());
		printDelimiter();
		
		Customer cust1 = new Customer("Andy", 50000);
		Order order1 = new Order(20200103, cust1);
		Order order2 = new Order(20200104, cust1);
		
		order1.procure(item1, 90);
		printDelimiter();
		
		order1.procure(item1, 20);
		order1.procure(item2, 10);

		System.out.print(item1.getInfo());
		System.out.print(item2.getInfo());
		printDelimiter();
		
		order1.calcShippingCosts(14);
		
		System.out.print(order1.getInfo());
		order1.checkout();
		System.out.print(order1.getInfo());
		printDelimiter();
		
		// Oder 2 operation
		order2.procure(item1, 20);
		order2.procure(item2, 10);
		order2.calcShippingCosts(30,14);
		
		System.out.print(order2.getInfo());
		order2.checkout();
		System.out.print(order2.getInfo());
	}
	
	public static void printDelimiter() {

		int count =0;
		while (count<=90) {
			System.out.print('-');
			count++;
		}
		System.out.println();
	}

}
