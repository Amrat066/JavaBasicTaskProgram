package Generic;


class Practice<T,U>{
	T test1;
	U test2;
	public Practice(T test1, U test2) {
		
		this.test1 = test1;
		this.test2 = test2;
	}
	
	public void showdata() {
		System.out.println("the Integer values is:="+this.test1);
		System.out.println("the String values is:="+this.test2);
		
		
	}
	
}
public class GenericPractice2 {
	
	
	public static void main(String args[]) {
		
		Practice<Integer,String> p=new Practice<Integer,String>(101,"amrat");
		p.showdata();
		
		
	}

}
