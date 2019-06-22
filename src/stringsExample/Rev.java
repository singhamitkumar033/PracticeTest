package stringsExample;

public class Rev {
	public static void main(String[] args) {
		String str = "Today is Saturday";
		String result = "";
		String[] temp = str.split(" ");
		for (int i = temp.length - 1; i >= 0; i--) {
			result = result + temp[i] + " ";
		}
		System.out.println(result);
	}
}
