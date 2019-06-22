package important;

public class StringReverseEachWords1 {

	public static void reversestring(String str) {

/*		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		String res = " ";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] == ' ') {
				i++;
			}
			int j = i - 1;
			while (k >= j) {
				res = res + ch[j];
				j--;
			}
			res = res + " ";
		}
		System.out.println(res);*/
		String[] stringArray=str.split(" ");
		String reverseString = "";
		for (String string : stringArray) {
			StringBuilder newString=new StringBuilder(string);
			newString.reverse();
			reverseString=reverseString+newString.toString()+" ";
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		System.out.println("String to Reverse");
		String str = "Amit Kumar Singh";
		char chss = 'a';
		System.out.println(str + chss);
		StringReverseEachWords1.reversestring(str);
	}
}
