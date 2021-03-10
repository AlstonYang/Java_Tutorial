import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class Tester {
	public static void main(String[] args) throws IOException {

		Fruit apple = new Fruit("Apple", 10);
		Fruit banana = new Fruit("Banana", 12);
		Fruit orange = new Fruit("Orange", 15);
		Fruit[] fruits = { apple, banana, orange };

		Register register = new Register();

		int id = 0;
		int num = 0;

		try {

			File myObj = new File("sales.txt");
			Scanner reader = new Scanner(myObj);
			String line = reader.nextLine();
			FileWriter myWriter = new FileWriter("register_info.txt");

			try {
				while (reader.hasNextInt()) {

					for (Fruit fruit : fruits) {
						num = reader.nextInt();
						register.calctotalCost(id, num, fruit.getPrice());
					}
					id++;
				}

				myWriter.write(register.getInfo());

			} finally {
				reader.close();
				myWriter.close();
				System.out.print(register.getInfo());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File cannot found.");
		} catch (NoSuchElementException e) {
			System.out.println("File contents are invalid.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
