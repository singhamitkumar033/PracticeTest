package part1;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("MMS");
		String str = "Greatest Developer Jayanth";
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		String reversestring = "";
		String res = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			res = res + ch[i];
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			reversestring = reversestring + str.charAt(i);
		}
		String finaleachWordRev = "";
		String[] strinfarr = str.split(" ");
		for (int i = 0; i < strinfarr.length; i++) {
			StringBuffer stringbuf = new StringBuffer(strinfarr[i]);
			stringbuf.reverse();
			finaleachWordRev = finaleachWordRev + stringbuf+" ";

		}
		System.out.println(res);
		System.out.println(reversestring);
		System.out.println(finaleachWordRev);
	}

}
