

public class Tester {
	public static void main(String[] args) {
		
		Student stu1 = new Student(109306100, "Allen", 15);
		Student stu2 = new Student(109306101, "Bob");
		Course c1 = new Course(306001, "OOPI-1", 2, 10);
		Course c2 = new Course(306011, "OOPI-2", 2, 20);
		
		stu1.enroll(c1);
		stu2.enroll(c2);
		stu2.enroll(c1);
		stu1.enroll(c2);
		stu1.drop(306001);
		stu2.drop(c2);
		System.out.println(stu1.getInfo());
		System.out.println("---------");
		System.out.println(stu2.getInfo());
		System.out.println("---------");
		System.out.println(c1.getInfo());
		System.out.println(c2.getInfo());
	}
}
