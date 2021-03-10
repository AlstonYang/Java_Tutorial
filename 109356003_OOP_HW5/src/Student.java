import java.util.ArrayList;

public class Student extends Person {

	private String major, tutorName;
	private int enrolledYear;
	private double grade;
	
	
	public Student (int ID, String name, String major, int enrolledYear, String tutorName, double grade) {
		super(ID, name);
		
		this.major = major;
		this.enrolledYear = enrolledYear;
		this.tutorName = tutorName;
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public int getEnrolledYear() {
		return this.enrolledYear;
	}
	
	public double getGrade(){
		return this.grade;
	}
	
	public String getTutorName() {
		return this.tutorName;
	}
	
	
	public String getInfo() {
		
		return String.format("Student[ID=%d, name=%s, major=%s, enrolledYear=%d, grade=%.2f]", 
				this.getID(), this.getName(), this.major, this.enrolledYear, this.grade);
	}
}
