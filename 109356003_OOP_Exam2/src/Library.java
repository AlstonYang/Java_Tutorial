import java.util.ArrayList;

public class Library {

	ArrayList <Book> collections;
	
	public Library() {
		collections = new ArrayList<>();
	}
	
	public void addCollection(Book book) {
		collections.add(book);
	}
	
	public void dropCollection(Book book) {
		collections.remove(book);
	}
	
	public String searchCollection(String keyWord) {
		
		String result = "The result:";
		
		for(Book book:collections) {
			
			if(book.getName().contains(keyWord)) {
				
				result += book.getName() +", ";
			}
		}
		return result;
	}
	
	public String getInfo() {
		String result = "Total Collection of the Library:";
		int totalCollection = 0;
		int totallending = 0;
		
		for(Book collection:collections) {
			totalCollection+=collection.getTotalNumber();
			totallending+=collection.getLendingVolume();
		}
		result+=Integer.toString(totalCollection)+"\nTotal lending transaction volume:"+Integer.toString(totallending);
		return result;
	}
}
