
public class DoubleMajor extends Student {

	private String major2; 
	
	public DoubleMajor(int ID, String name, String major, int enrolledYear, String tutorName, double grade, String major2Name) {
		super(ID, name, major, enrolledYear, tutorName, grade);
		// TODO Auto-generated constructor stub
		this.major2 = major2Name;
	}
	
	public String getMajor2() {
		return this.major2;
	}
	
	public String getInfo() {
		return String.format("DoubleMajor[ID=%d, name=%s, major=%s, major2=%s, enrolledYear=%d, grade=%.2f]", 
									this.getID(), this.getName(), this.getMajor(), this.major2, this.getEnrolledYear(), this.getGrade());
	}

}
