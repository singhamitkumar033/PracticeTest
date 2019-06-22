package part1;

public class Selenium {
	void sum(int arr[]){
		System.out.println("--sum(int[])");
		System.out.println("Length of Arr: "+arr.length);
		int s=0;
		for (int a : arr){
			s=s+a;
		}
		System.out.println("sum is: "+s);
	}
public static void main(String[] args) {
	Selenium sel=new Selenium();
	sel.sum(new int[0]);
	sel.sum(new int[]{10,25});
	sel.sum(new int[]{12,42,51});
}
}