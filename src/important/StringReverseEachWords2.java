package important;

import java.util.StringTokenizer;

public class StringReverseEachWords2 {
	public static void reversestring(String str) {
		// String[] string=str.split("");
		StringTokenizer string1 = new StringTokenizer(str);
		while(string1.hasMoreTokens()){
			System.out.print(string1.nextToken()+" ");
		}
		
	}

	public static void main(String[] args) {
		StringReverseEachWords2.reversestring("Amit   iajda adahd  adiahdh");
	}
	
}
