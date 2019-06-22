package strings;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] prod1 = new Product[5];
		prod1[4] = new Product(101, "yarta", "ytr152", 122121);
		prod1[1] = new Product(103, "Flipkart", "fpk110l", 15500001);
		prod1[3] = new Product(102, "Amazon", "amz104", 150000000);
		prod1[0] = new Product(105, "stackOverflow", "stof101", 2500000);
		prod1[2] = new Product(104, "Snapdeal", "snp162", 350000);

		System.out.println(".........unsorted array elements.............");
		for (int i = 0; i < prod1.length; i++) {
			System.out.println(prod1[i]);
		}

		Arrays.sort(prod1);
		System.out.println("..........Sorted Array........");
		for (int i = 0; i < prod1.length; i++) {
			System.out.println(prod1[i]);
		}
	}
}
