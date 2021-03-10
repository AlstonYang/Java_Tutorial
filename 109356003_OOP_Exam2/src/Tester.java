import java.io.FileWriter;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 =  new Book(109101, "Java programmer1");
		Book book2 =  new Book(109102, "Java programmer2",5);
		Book book3 =  new Book(109102, "Python",3);
		
		Library library = new Library();
		library.addCollection(book1);
		library.addCollection(book2);
		library.addCollection(book3);
		
		Reader reader1 = new Reader(001,"Peter");
		Reader reader2 = new Reader(002,"Amy");
		
		System.out.println("----Operational condition------");
		System.out.println(reader1.checkOut(book1));
		System.out.println(reader2.checkOut(book1));
		System.out.println(reader2.reserve(book1));
		System.out.println(reader2.takeBook(book1));
		System.out.println(reader2.checkOut(book2));
		System.out.println(reader2.checkOut(book3));
		
		System.out.println("\n-----Reader1 information-----");
		System.out.println(reader1.getInfo());
		
		System.out.println("-----Reader2 information-----");
		System.out.println(reader2.getInfo());

		System.out.println("-----book1 information-----");
		System.out.println(book1.getInfo());
		
		System.out.println("\n-----Searching the Library Resources-----");
		System.out.println(library.searchCollection("Java"));
		
		System.out.println("\n-----Library Statistics-----");
		System.out.println(library.getInfo());
		
		try {
			FileWriter writer = new FileWriter("Library.txt");
			try {
				writer.write(library.getInfo());
			}finally {
				writer.close();
			}
		}catch(IOException e) {
			System.out.println("Can not output the file.");
		}
	}

}
