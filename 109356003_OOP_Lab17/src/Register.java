import java.util.ArrayList;

public class Register {

	private ArrayList<Student> studentList;
	private ArrayList<Course> courseList;
	
	
	public Register() {
		
		studentList = new ArrayList<Student>();
		courseList = new ArrayList<Course>();
	}
	
	public void addStudent(String id, String name) {
		
		this.studentList.add(new Student(id, name));
	}
	
	public void addCourse(String id, String name, int credits) {
		
		this.courseList.add(new Course(id, name, credits));
	}
	
	public Student findStudent(String studentID) {
		
		for(Student student : studentList) {
			if (student.getID().equals(studentID)) {
				return student;
			}
		}
		
		return null;
	}
	
	public Course findCourse(String courseID) {
		
		for(Course course : courseList) {
			if (course.getID().equals(courseID)) {
				return course;
			}
		}
		
		return null;
	}
	
	public boolean enrollCourse(String studentID, String courseID) {
		
		Student findedStudent = this.findStudent(studentID);
		Course findedCourse = this.findCourse(courseID);
		
		if (findedStudent!=null && findedCourse!=null) {
			if (findedStudent.getCurrentCredits() + findedCourse.getCredits() <= findedStudent.getMaxCredits() && !findedStudent.getEnrolledCourses().contains(courseID)) {
				
				findedStudent.updateCurrentCredits(findedCourse.getCredits());
				findedStudent.getEnrolledCourses().add(courseID);
				
				return true;
			}
		}
		
		return false;
	}
	
	public boolean dropCourse(String studentID, String courseID) {
		
		Student findedStudent = this.findStudent(studentID);
		Course findedCourse = this.findCourse(courseID);
		
		if (findedStudent!=null && findedCourse!=null) {
			if (findedStudent.getEnrolledCourses().contains(courseID)) {
				
				findedStudent.updateCurrentCredits(-1*findedCourse.getCredits());
				findedStudent.getEnrolledCourses().remove(courseID);
				return true;
			}
		}
		return false;
	}
}
