package Enumerationn;

enum car{
	bmw("good"),
	suzuki("better"),
	thar("excellent"),
	farari("brilliant");
	
	private String des;
	car(String des){
		this.des=des;
	
	}
	public String getCar() {
		return des;
	}
	
}
public class ToStringMethod {
		public static void main(String args[]) {
			
		car[]c=car.values();
		for(car d:c) {
			
			System.out.println(d+": "+d.getCar());
			
			
		}
		System.out.println(car.bmw.ordinal());
		System.out.println(car.valueOf("farari"));
		
		}
}
