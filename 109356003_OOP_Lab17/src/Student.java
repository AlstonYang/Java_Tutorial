import java.util.ArrayList;

public class Student {

	private String id;
	private String name;
	private ArrayList<String> enrolledCourses;
	private int currentCredits;
	private int maxCredits;

	public Student(String id, String name) {
		
		this.id = id;
		this.name = name;
		this.currentCredits = 0;
		this.maxCredits = 25;
		this.enrolledCourses = new ArrayList<String>();
	}
	
	public String getID() {
		
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCurrentCredits() {
		return this.currentCredits;
	}
	
	public int getMaxCredits() {
		
		return this.maxCredits;
	}
	
	public ArrayList<String> getEnrolledCourses(){
		
		return this.enrolledCourses;
	}
	
	public void setID(String id) {
		
		this.id = id;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setMaxCredits(int maxCredits) {
		
		this.maxCredits = maxCredits;
	}
	
	public void updateCurrentCredits(int addedCredits) {
		
		this.currentCredits += addedCredits;
	}
	
	public String getInfo() {
		
		String mes = "";
		
		String enrollCourseInfo="[";
		for (String enrolledCourse : this.enrolledCourses) {
			
			enrollCourseInfo += String.format("%s", enrolledCourse);
			
			if (this.enrolledCourses.indexOf(enrolledCourse)!=this.enrolledCourses.size()-1) {
				
				enrollCourseInfo += ", ";
			}
		}  
		enrollCourseInfo+="]";
		
		mes += String.format("[%s: %s, %s: %s, %s: %s, %s: %d, %s: %d]", 
								"Student ID", this.id, "Student Name", this.name, "Enrolled Courses", enrollCourseInfo, "Current Credits", this.currentCredits, "Max Credits", this.maxCredits);
		
		return mes;
	}
}
