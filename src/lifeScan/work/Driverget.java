package lifeScan.work;

import java.util.HashMap;

public class Driverget {

	public static void main(String[] args) {
		String capability = "{'user':'onetouchtestuser@gmail.com','password':'c0nn3ct','platformName':'Windows','platformVersion':'10','browserName':'Chrome','browserVersion':'71','resolution':'1280x1024','location':'US East'}";
		String newstring = capability.replaceAll("'", "").replaceAll("=", "").replaceAll(",", "");
		String[] udpastr = newstring.split(":");
		HashMap<String, String> hash = new HashMap<>();
		for (int i = 0; i < udpastr.length - 1; i = i + 2) {
			hash.put(udpastr[i], udpastr[i + 1]);
		}
		System.out.println(hash);

		if (hash.containsValue("'Chrome'"))
			System.out.println("true");

		else
			System.out.println("Fail");
		System.out.println("capability " + capability.contains("onetouch"));
	}

}
