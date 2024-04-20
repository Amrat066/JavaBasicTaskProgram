package Enumerationn;



enum meal{
	
	BREAKFAST,
	LUNCH,
	SNACKS, 
	DINNER;
	
	private int price;
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int GetPrice() {
		return price;
	}


}
public class Enum2 {

	public static void main(String[] args) {
		for(meal m:meal.values()) {
			m.setPrice(50);
			System.out.println(m+" " +m.GetPrice());
		}
		
	}

}
