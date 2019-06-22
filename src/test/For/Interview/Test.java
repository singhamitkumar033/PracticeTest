package test.For.Interview;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		int a=9;
		int b=1;
		System.out.println(a+b+"a");
		System.out.println("a"+a+-b);
		
		String str="a";
		String str1=""+a;
		String str2=a+"";;
		System.out.println(str);
		System.out.println(str1); 
		System.out.println(str2);	
		ArrayList<String> listsor=new ArrayList<String>();
		listsor.add("KingHCP51b newHCP");
		listsor.add("easy KingHCP51a");
		listsor.add("test kingUSCM37");
		listsor.add("test KingHCP51");
		System.out.println(listsor);
		Collections.sort(listsor);
		System.out.println(listsor);
	}
}

class bnew{
	public static void main(String[] args) {
		Test.main(args);
	}
}
