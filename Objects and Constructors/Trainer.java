package constructors;

public class Trainer {
	int id;
	String name;
	String subject;
	void giveData(int a, String b, String c) {
		id=a;
		name=b;
		subject=c;
	}
	void teach() {
		System.out.println("Started teaching");
	}
	void takeAttendance() {
		System.out.println("Attendance taken");
	}
}
class TrainerApp{
	public static void main(String[] args) {
		Trainer t =new Trainer();
		t.giveData(1234,"Arun","Java");
		System.out.println(t.id+", "+t.name+", "+t.subject);
		t.teach();
		t.takeAttendance();
	}	
}
