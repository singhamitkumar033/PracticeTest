package part1;

public class Lab262 {
	public static void main(String[] args) {
		Student stu1 = new Student(88, "Srinivas");
		stu1.show();
		Student stu2 = new Student(55, "Dande");
		stu2.show();
	}
}

class Student {
	int sid;
	String sname;

	Student(int id, String sn) {
		System.out.println("2-args Constructor");
		sid = id;
		sname = sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
