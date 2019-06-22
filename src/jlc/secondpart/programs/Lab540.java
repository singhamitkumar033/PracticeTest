package jlc.secondpart.programs;

public class Lab540 {
	public static void main(String[] args) {
		Hello h = Hello.getHello();
		System.out.println(h);

		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());
//   Hello h2=(Hello)h.clone();
//   System.out.println(h2);
	}

}

class Hello1 {
	private static Hello1 INS = new Hello1();

	private Hello1() {
	}

	public static Hello1 getHello() {
		return INS;
	}

	protected Object clone() {
		return this;

	}
}
