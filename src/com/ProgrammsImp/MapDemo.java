package com.ProgrammsImp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// Map map=new HashMap();
		Map<Comparable, String> map = new LinkedHashMap<Comparable, String>();
		map.put("hsh", "Bhagyashri");
		map.put(6, "Wagle");
		map.put(3, "Ravindra");
		map.put(new Student(4, "Sunny"), "Nisha");
		map.put("Student", "Monica");
		System.out.println(map.get(4));
		System.out.println("============");
		map.forEach((key, value) -> {
		    System.out.println("Key : " + key + " Value : " + value);
		});
		
	}

}
