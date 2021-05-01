
public class Course {

	private String id;
	private String name;
	private int credits;
	
	public Course(String id, String name, int credits) {
		
		this.id = id;
		this.name = name;
		this.credits = credits;
	}
	
	public String getID() {
		
		return this.id;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getCredits() {
		
		return this.credits;
	}
	
	public String getInfo() {
		
		String mes = "";
		mes += String.format("[%s: %s, %s: %s, %s: %d]", 
								"Course ID", this.id, "Course Name", this.name, "Credits", this.credits);
		
		return mes;
	}
}
