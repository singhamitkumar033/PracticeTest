package part1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Jayanth";
		System.out.println(str1.startsWith("ay"));
		System.out.println(str1.endsWith("th"));
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(2, 5));
//char[] ch=str1.toCharArray();
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf("nt"));
		System.out.println(str1.contains("na"));
	}
}