import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class Tester2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchElementException {

		Fruit apple = new Fruit("Apple", 10);
		Fruit banana = new Fruit("Banana", 12);
		Fruit orange = new Fruit("Orange", 15);
		Fruit[] fruits = { apple, banana, orange };

		File myObj = new File("sales.txt");
		Scanner reader = new Scanner(myObj);
		String line = reader.nextLine();

		Register register = new Register();
		FileWriter myWriter = new FileWriter("register_info.txt");

		int id = 0;
		int num = 0;

//		String register_info = "My register info:\n";
//		register_info += String.format("%5s%7s%7s%5s\n", "Apple", "Banana", "Orange", "Bill");

		try {
			while (reader.hasNextInt()) {

				for (Fruit fruit : fruits) {
					num = reader.nextInt();
//					register_info += String.format("%6d", num);
					register.calctotalCost(id, fruit.getPrice(), num);
				}
//				register_info += String.format("%5d\n", register.getCost(id));
				id++;
			}

			System.out.print(register.getInfo());

//			register_info += "Total Revenue:" + register.gettotalRevenue();

			myWriter.write(register.getInfo());
		}

		finally {
			reader.close();
			myWriter.close();
		}

	}
}
