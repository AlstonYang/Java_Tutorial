import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private int totalNumber;
	private int remainNumber;
	int lendingVolume;

//	ArrayList<Reader>borrowers;
//	ArrayList<Reader>reservers;
	
	public Book(int bookId, String name) {
		this.id = bookId;
		this.name = name;
		this.totalNumber=1;
		this.remainNumber=1;
		lendingVolume=0;
//		borrowers = new ArrayList<>();
//		reservers = new ArrayList<>();
	}
	
	public Book(int bookId, String name, int totalNumber) {
		this.id = bookId;
		this.name = name;
		this.totalNumber=totalNumber;
		this.remainNumber=totalNumber;
		this.lendingVolume=0;
//		borrowers = new ArrayList<>();
//		reservers = new ArrayList<>();
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getRemainNumber() {
		
		return this.remainNumber;
	}
	
	public int getTotalNumber() {
		
		return this.totalNumber;
	}
	
	public int getLendingVolume() {
	
		return this.lendingVolume;
	}
	
	
	public void updateRemainNumber(int i) {
		remainNumber+=i;
	}
	
	public void updateLendingVolume() {
		lendingVolume+=1;
	}
	
	public String getInfo() {
		
		return String.format("ID:%d\nName:%s\nRemaining number/Total number:%d/%d", 
								this.id,this.name, this.remainNumber,this.totalNumber);
	}
}
