package part1;

public class UpcastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		Demo3 d3 = new Demo3();
		System.out.println(d3.i);
		d3.test();
		System.out.println(d3.d);
		d3.view();
		System.out.println(d3.l);
		d3.run();
		System.out.println(d3);

		Demo2 d2 = (Demo2) d3;
		System.out.println(d2.i);
		d2.test();
		System.out.println(d2.d);
		d2.view();
		System.out.println(d2);

		Demo1 d1 = (Demo1) d3;
		System.out.println(d1.i);
		d3.test();
		System.out.println(d1);
		System.out.println("MME");
	}

}

class Demo1 {
	int i;

	void test() {
		System.out.println("Demo 1 Method");
	}
}

class Demo2 extends Demo1 {
	double d;

	void view() {
		System.out.println("Demo 2 method");
	}
}

class Demo3 extends Demo2 {
	long l;

	void run() {
		System.out.println("Demo 3 Method");
	}
}
