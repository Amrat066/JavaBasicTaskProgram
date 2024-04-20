package Enumerationn;


enum TicketRegisterr{
	CRITICAL("Critical description"),
	LOW("Low description"),
	HIGH("high description"),
	MEDIUM("Medium description");
	
	private String description;
	
	TicketRegisterr(String desc){
		this.description=desc;
	}
	
	public String getDescription() {
		return description;
	}
}
public class Enum3 {
	
		public static void main(String args[]) {
			
			TicketRegisterr r=TicketRegisterr.CRITICAL;
			if(TicketRegisterr.CRITICAL==r) {
				System.out.println("This is critical");
			}
			else {
				System.out.println("this is not critical");
			}
			
		}
}
