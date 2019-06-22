package part1;

public class Lab244 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Lab244l.a);
		System.out.println(Lab244l.a);
	}
}

class Lab244l {
	static int a = 10;
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
}
