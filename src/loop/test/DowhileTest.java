package loop.test;

import java.util.ArrayList;
import java.util.List;

public class DowhileTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int i = 2;
		do {
			System.out.println("test " + i);
		} while (i++ < 10);

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
			if (i == 5)
				continue;
			System.out.println("After " + j);
		}
		int arr[] = new int[3];
		String names[];
		List lisjs = new ArrayList<>();
		lisjs.add(8);
		lisjs.add("ksd");
		lisjs.forEach((number) -> System.out.println(number));
		/*for (Object object : lisjs) {
			String ljdj = (String) object;
			System.out.println(object);
		}*/
		System.out.println(lisjs);

	}
}
