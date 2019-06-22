package part1;

public class Lab233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello h1=new Hello(); If we want to use this object the we can access a in
		// static way.(like we have to remove static from the variable a).
		// Hello h2=new Hello();
		System.out.println(Hello.a + "\t" + Hello.a);
		Hello.a = 99;
		System.out.println(Hello.a + "\t" + Hello.a);
	}
}

class Hello {
	static int a = 0;
}