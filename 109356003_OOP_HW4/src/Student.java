import java.util.ArrayList;

public class Student {

	private int studentID, currentCredits, maxCredits;
	private String studentName;
	private ArrayList<Course> enrolledCourses;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.studentName=name;
		this.currentCredits =0;
		this.maxCredits=25;
		this.enrolledCourses = new ArrayList<Course>();
	}
	
	public Student(int studentID, String name, int maxCredits) {
		
		this.studentID = studentID;
		this.studentName = name;
		this.maxCredits = maxCredits;
		this.currentCredits=0;
		this.enrolledCourses = new ArrayList<Course>();
	}
	
	public void setStudentName(String name) {
		
		this.studentName = name;
	}
	
	public void setCurrentCredits(int credit) {
		
		this.currentCredits = credit;
	}
	
	public void setMaxCredits(int maxCredit) {
		
		this.maxCredits = maxCredits;
	}
	
	public int getStudentID() {
	
		return this.studentID;
	}
	
	public String getStudentName() {
		
		return this.studentName;
	}
	
	public ArrayList<Course> getEnrolledCourses() {
		
		return this.enrolledCourses;
	}
	
	public int getCurrentCredits() {
		
		return this.currentCredits;
	}
	
	public int getMaxCredits() {
		
		return this.maxCredits;
	}
	
	public Course getCourse(int index) {
		
		return this.enrolledCourses.get(index);
	}
	
	public void enroll(Course course) {
		
		if(course.enrolled+1 >= course.capacity)
			System.out.printf("%d is full.",course.courseID);
		else if (this.currentCredits+course.credits>=this.maxCredits)
			System.out.printf("%d cannot enroll any course.",this.studentID);
		else
			this.enrolledCourses.add(course);
			this.currentCredits += course.credits;
			course.enrolled+=1;
	}
	
	public void drop(int courseID) {
		
		boolean findedResult = false;
		
		for (Course enrolledcourse:enrolledCourses) {
			if (enrolledcourse.courseID == courseID) { 
				this.enrolledCourses.remove(enrolledcourse);
				this.currentCredits -= enrolledcourse.credits;
				enrolledcourse.enrolled -=1;
				findedResult = true;
				break;
			}
		}
		
		if (!findedResult) 
			System.out.printf("%s does not in %d\n",this.studentID, courseID);
	}
	
	public void drop(Course course) {
			
			
			if (enrolledCourses.contains(course)) {
				this.enrolledCourses.remove(course);
				this.currentCredits -= course.credits;
				course.enrolled -=1;
			}else
				System.out.printf("%s does not in %d\n",this.studentID, course.courseID);
			
		}
	
	public String getInfo() {
		String IDInfo = String.format("Student ID: %d\n", this.studentID);
		String nameInfo = String.format("Name: %s\n", this.studentName);
		String creditInfo = String.format("Credits: %d/%d\n", this.currentCredits, this.maxCredits);
		String courseInfo = String.format("Course list:\n");
		
		for (Course enrolledCourse:this.enrolledCourses) {
			courseInfo += enrolledCourse.getCourseID()+" "+enrolledCourse.getCourseName()+" "+enrolledCourse.getCredits()+"\n";
		}
	
		return IDInfo + nameInfo + creditInfo + courseInfo;
	}
	
}
