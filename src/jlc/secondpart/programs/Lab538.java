package jlc.secondpart.programs;

public class Lab538 {

	public static void main(String[] args) {
//		Hello h=Hello.getHello();
//   System.out.println(h);
//  
//   System.out.println(Hello.getHello());
//   System.out.println(Hello.getHello());
		
		for(int i=0;i<10;i++){
			System.out.println(Hello.getHello());
		}
	}

}

class Hello{
	private static Hello h1=new Hello();
	private static Hello h2=new Hello();
//	static{
//		INS=new Hello();  //this is another way if we are not using if condition.
//	}
	private Hello(){}
	public static Hello getHello(){
		if(Math.random()>.5)
		return h1;
		else
			return h2;
	}
}