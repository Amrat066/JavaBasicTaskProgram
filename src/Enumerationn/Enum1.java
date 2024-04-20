package Enumerationn;

enum TicketRegister{
	
	CRITICAL("critical descritpion"),
	MEDIUM("medium critical"),
	HIGH("high description"),
	LOW("low description");
	
	private String description;
	
	
	TicketRegister(String des){
		
		this.description=des;
		
	}
	public String GetDescription() {
		return description;
	}
	
}
public class Enum1 {
	public static void main(String args[]) {
		
		TicketRegister ticket = null;
		System.out.println(ticket.CRITICAL.GetDescription());
		System.out.println(ticket.HIGH.GetDescription());
		
	}

}
