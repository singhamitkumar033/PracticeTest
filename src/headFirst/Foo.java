package headFirst;

public class Foo {
 private int z;
 
	public int getZ() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}

	public void go(){
		int x=5;
		int z=x+3;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Foo a=new Foo();
		Foo b=new Foo();
		Foo c=a;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		a.setZ(45);
		System.out.println(a.getZ());

		
	}
}
