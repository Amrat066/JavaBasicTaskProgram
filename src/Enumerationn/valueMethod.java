package Enumerationn;


enum meall{
	BREAKFAST("good"),
	LUNCH("excellent"),
	SNACKS("nice"), 
	DINNER("so nice");
	
	private String description;
	meall(String desc){
		this.description=desc;
	}
	
	public String getDescription() {
		return description;
	}
}
public class valueMethod {
	
	
	public static void main(String args[]) {
		
		for(meall m:meall.values()) {
			System.out.println(m+" "+m.getDescription());
		}
		int length=meall.values().length;
		System.out.println(length);
	}

}
