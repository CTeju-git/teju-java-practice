package states_and_behaviours;

public class Student {
	int id;
	String name;
	String branch;
	void eat() {
		System.out.println("keep on eating");
	}
	void sleep() {
		System.out.println("sleep for 8 hrs");
	}
	void study() {
		System.out.println("study for 4 hrs");
	}
}
class StudentApp{
	public static void main(String[] args) {
		Student s=new Student();
		s.id=1234;
		s.name="Teju";
		s.branch="ECE";
		s.eat();
		s.sleep();
		s.study();
		System.out.println("ID="+s.id+", Name="+s.name+", Branch="+s.branch);
	}
}
