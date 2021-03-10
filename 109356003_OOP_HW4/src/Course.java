
public class Course {

	int courseID, credits, capacity, enrolled;
	String courseName;
	
	public Course(int id, String name, int credits, int capacity) {
		
		this.courseID = id;
		this.courseName = name;
		this.credits = credits;
		this.capacity = capacity;
		this.enrolled =0;
	}
	
	public void setCapacity(int capacity) {
		
		this.capacity = capacity;
	}
	
	public void setEnrolled(int num) {
		
		this.enrolled = num;
	}
	
	public int getCourseID() {
		
		return this.courseID;
	}
	
	public String getCourseName() {
		
		return this.courseName;
	}
	
	public int getCredits() {
		
		return this.credits;
	}
	
	public int getCapacity() {
		
		return this.capacity;
	}
	
	public int getEnrolled() {
		
		return this.enrolled;
	}
	
	public String getInfo() {
		
		return String.format("%d %s %d %d/%d", this.courseID, this.courseName, this.credits, this.enrolled, this.capacity);
	}
	
}
