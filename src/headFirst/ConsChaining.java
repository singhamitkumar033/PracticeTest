package headFirst;

public class ConsChaining {

	public ConsChaining(){
		System.out.println("0-arg Constructer");
	}
	public ConsChaining(int a){
		this();
		System.out.println("1-arg Constructer");
	}
	public ConsChaining(int a, int b){
		this(55);
		System.out.println("2 arg Constructor");
	}
	
	public static void main(String[] args) {
		ConsChaining cons=new ConsChaining(10,5);
		System.out.println(cons.toString());
	}
	@Override
	public String toString() {
		return "ConsChaining [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
