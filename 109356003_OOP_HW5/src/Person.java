
public class Person {

	private int ID;
	private String name;
	
	public Person(int ID, String name) {
		
		this.ID = ID;
		this.name=name;
		
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getInfo() {
		return String.format("Person[ID=%d, name=%s]", this.ID, this.name);
	}
	
}
