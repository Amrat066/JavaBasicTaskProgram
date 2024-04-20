package Generic;


//Gneric is moslty used for type safety 

//take integer value of the generic 

class Test<T>{
	
	T obj,obj2;
	Test(T obj, T obj2){
		
		this.obj=obj;
		this.obj2=obj2;
	}
	public String getdata() {
		return this.obj+" "+this.obj2;
	}
	
}

public class GenericPractice {	
	
	public static void main(String args[]) {
		
		Test<Integer> i=new Test<Integer>(101,102);
		
		System.out.println(i.getdata());
		
	
		
	}

}
