import java.util.ArrayList;

public class Reader {

	private int id;
	private String name;
	ArrayList<Book>borrows;
	ArrayList<Book>reserves;
	
	public Reader(int readerId, String readerName) {
		this.id = readerId;
		this.name = readerName;
		borrows = new ArrayList<>();
		reserves = new ArrayList<>();
	}
	
	public String checkOut(Book book) {
		
		if (book.getRemainNumber()-1>=0) {
			borrows.add(book);
			book.updateRemainNumber(-1);
			book.updateLendingVolume();
			return "Successfully borrowed.";
		}else {		
			return "Unable to borrow.";
		}
	}
	
	public String checkIn(Book book) {
		
		borrows.remove(book);
		book.updateRemainNumber(1);
		return "Successfully returned.";
	}
	
	public String reserve(Book book) {
		reserves.add(book);
		book.updateRemainNumber(-1);
		return "Successfully reserved.";
	}
	
	public String takeBook(Book book) {
		if(reserves.contains(book) && book.getRemainNumber()>0) {
			this.borrows.add(book);
			this.reserves.remove(book);
			book.updateLendingVolume();
			return "Successfully claim the book.";
		}else {
			return "Unable to claim the book.";
		}
	}
	
	public String getInfo() {
		
		String result = String.format("Reader ID: %d\nReader Name: %s", this.id, this.name);
		String BorrowedBook = "Borrowed book:";
		String ReservedBook = "Reserved book:";
		
		for(Book borrow:borrows) {
			BorrowedBook+=borrow.getName()+", ";
		}
		
		for(Book reserve:reserves) {
			ReservedBook+=reserve.getName()+", ";
		}
		
		return result + "\n" + BorrowedBook + "\n" + ReservedBook+"\n";
	}
}
