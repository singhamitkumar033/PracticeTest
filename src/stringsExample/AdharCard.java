package stringsExample;

public class AdharCard{
	private static String name;
	private static int adharNum=100;
	
	public static AdharCard adharCard=new AdharCard();
	
	public AdharCard(){
		System.out.println("adharCard");
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		AdharCard.name = name;
	}

	public static int getAdharNum() {
		AdharCard.setAdharNum(adharNum);
		return adharNum;
	}

	public static void setAdharNum(int adharNum) {
		adharNum++;
		AdharCard.adharNum = adharNum;
	}
	
	public static AdharCard getAdharCard(){
		if(adharCard==null){
			adharCard=new AdharCard();
		}
		return adharCard;
	}
}