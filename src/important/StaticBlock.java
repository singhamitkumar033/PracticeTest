package important;

public class StaticBlock {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main meethod runs");
	}*/

	static {
		// static method runs before the main method.
		System.out.println("Static method is running");
	}

}
/*
 * class StaticBlock { public static void main(String[] args) {
 * System.out.println("You are using Windows_NT operating system."); }
 * 
 * static { String os = System.getenv("OS"); if (os.equals("Windows_NT") !=
 * true) System.exit(1); } }
 */