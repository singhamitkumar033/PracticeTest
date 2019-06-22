package java8.features;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsingLambda {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0);
		treeset.add(850);
		treeset.add(235);
		treeset.add(1080);
		treeset.add(15);
		treeset.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + treeset);
		treeset.forEach((number) -> System.out.println(number));
		for (Integer integer : treeset) {
			System.out.println(integer +" ");
		}
	}
}
