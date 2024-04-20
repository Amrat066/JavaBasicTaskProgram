package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Arithmetic {

	public static void main(String[] args) throws Exception {
		
		
		
		Class myclass=Reflect.class;
		
		Method[]m=myclass.getDeclaredMethods();
		for(Method k:m) {
			System.out.println(k.invoke(new Reflect(12,45)));
		}
			
//		  Method myMethod = myclass.getDeclaredMethod("Add");
//		  System.out.println(myMethod.invoke(new Reflect(12,34)));
	}

}
