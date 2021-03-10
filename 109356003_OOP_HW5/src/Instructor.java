import java.text.DecimalFormat;
import java.util.ArrayList;

public class Instructor extends Person {

	private String department;
	private ArrayList<String> lectureList;
	private ArrayList<Student> studentList;
	
	public Instructor(int ID, String name, String department) {
		super(ID, name);
		
		this.department = department;
		lectureList = new ArrayList<String>();
		studentList = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return this.department;
	}
	
	public ArrayList<String> getLectureList(){
		return this.lectureList;
	}
	
	public ArrayList<Student> getStudentList(){
		return this.studentList;
	}
	
	public void addLecture(String lectureName) {
		lectureList.add(lectureName);
	}
	
	public boolean addStudent(Student student) {
		
		if (student.getTutorName().equals(this.getName())) {
			studentList.add(student);
			return true;
		}else {
			return false;
		}
	}
	
	public String getStudentName() {
		
		String studentInfo = "";
		for (Student student:studentList) {
			studentInfo += student.getName()+", ";
		}
		studentInfo = studentInfo.substring(0, studentInfo.length()-2);
		
		return studentInfo;
	}
	
	public double getStudentAverage() {
		double scoreAvg=0;
		for (Student student:studentList) {
			scoreAvg += student.getGrade();
		}
		scoreAvg /= studentList.size();
		
		return scoreAvg;
	}
	
	public String getInfo() {
		
		String lectureInfo = "";
		for (String lecture:lectureList) {
			lectureInfo += lecture+", ";
		}
		lectureInfo = lectureInfo.substring(0, lectureInfo.length()-2);
		
		return String.format("Instructor[ID=%d, name=%s, department=%s, lectureList=%s, studentList=%s]", 
								this.getID(), this.getName(), this.department, lectureInfo, this.getStudentName());
	}
}
