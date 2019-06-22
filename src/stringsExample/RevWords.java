package stringsExample;

public class RevWords {

	public static void main(String[] args) {
		String str = "Today is Saturday";
		/*
		 * Pattern pattern = Pattern.compile("\\s"); String[] temp=pattern.split(str);
		 * String result= "";
		 * 
		 * for(int i=0; i<temp.length; i++) {
		 * 
		 * if(i==temp.length-1) result =temp[i]+result; else result=" "+temp[i]+result;
		 * } System.out.println(result); }
		 */
		RevWords.add(1, 2, 4, 8);
		String result = "";
		String[] temp = str.split(" ");

		for (int i = temp.length; i <= 0; i--) {
			result = temp[i] + " ";
		}
		System.out.println(result);
	}

	public static void add(int... instegr) {
		int sum = 0;
		for (int i : instegr) {
			sum = sum + i;
		}
		System.out.println("Sum is :" + sum);
	}
}
