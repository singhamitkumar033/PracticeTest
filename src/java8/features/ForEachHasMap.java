package java8.features;

import java.util.Arrays;
import java.util.HashMap;

public class ForEachHasMap {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();

    /*Adding elements to HashMap*/
	map.put(12, "Chaitanya");
	map.put(2, "Rahul");
    map.put(7, "Singh");
    map.put(49, "Ajeet");
    map.put(3, "Anuj");
	
 //   System.out.println(map);
	map.forEach((key, value) -> {
	    System.out.println("Key : " + key + " Value : " + value);
	});

	// It will only display the characters which are duplicates, it is very easy and less complex.
	 map.forEach((key,value) -> {
	      if(value > 1){
	           System.out.println("Key : " + key + " Value : " + value);
	      }
	  });
	
	int[] intarr= {1,4,8,1,7};
	Arrays.sort(intarr);
	for (int i : intarr) {
		System.out.println(i);	
	}
	
}
}
