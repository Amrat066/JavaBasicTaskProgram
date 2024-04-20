package Enumerationn;


enum Day{
	
	SUNDAY("day"),MONDAY("day"),TUESDAY("day");
	
	private String day;
	
	Day(String day){
		this.day=day;
	}
	
	public String getDay() {
		return day;
	}
}
public class Enum4 {
	public static void main(String args[]) {
		
		
		Day d=Day.MONDAY;
		switch (d) {
		case MONDAY:
			System.out.println("company is open");
			break;
		case TUESDAY:
			System.out.println("compny is close");
			break;
		case SUNDAY:
			System.out.println("half day");
			
		default:
			break;
		}
		
	}

}
