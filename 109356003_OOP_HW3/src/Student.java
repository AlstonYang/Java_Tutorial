
public class Student {

	private int studentID,  gradesIndex;
	private String name, department;
	private int [] grades;
	
	public Student(int studentID, String name, String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;
		gradesIndex = 0;
		grades = new int[5];
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getStudentID() {
		return studentID;
	}
	

	public String getName() {
		return name;
	}
	
	
	public String getDepartment() {
		return department;
	}
	
	
	public int[] getGrades() {
		return grades;
	}
	
	public int getGradesIndex() {
		return gradesIndex;
	}
	
	public int getGrade(int idx) {
		return this.grades[idx];
	}
	
	public void addGrade(int grade) {
		if(gradesIndex <5) {
			grades[gradesIndex] = grade;
			gradesIndex +=1;
		}else {
			System.out.println("Array index out of bounds.");
		}
	}
	
	public void updateGrade(int idx, int grade) {
		grades[idx] = grade;
	}
	
	public String info() {
		
		String gradesStr="";
		for(int i=0; i<grades.length;i++) {
			gradesStr += String.format("%3s", grades[i]);
		}
		
		String message = 
				String.format("%11s: %-9d\n%11s: %-9s\n%11s: %-9s\n%11s: %-9s", 
						"Student ID", this.getStudentID(), "Name", this.getName(), "Department", this.getDepartment(), "Grades",gradesStr);
	
		return message;
	}
}
