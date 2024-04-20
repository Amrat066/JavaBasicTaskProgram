package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RumMain {

	public static void main(String args[]) throws Exception {
		
		Employee e=new Employee(101,"amrat","surat");
		Class obj=e.getClass();
		
		System.out.println("Reflection of java methods:.....\n");
		
		Method[]m=obj.getDeclaredMethods();
		for(Method k:m) {
			System.out.println("the total methods is:="+k.getName());
			System.out.println("the modifier is:="+Modifier.toString(k.getModifiers()));
			System.out.println("the return type is:="+k.getReturnType());
			System.out.println("the parameter is:="+k.getParameterCount());
			System.out.println("generic string:="+k.toGenericString()+"\n");
		
		}
		
		System.out.println("Reflection of java constructor:.....\n");
		Constructor<?>[]c=obj.getDeclaredConstructors();
		for(Constructor<?> d:c) {
			System.out.println("the total constructor is:="+d.getName());
			System.out.println("the constructors modifier is:="+Modifier.toString(d.getModifiers()));
			System.out.println("the total parameter is:="+d.getParameterCount());
			System.out.println("the generic string is:="+d.toGenericString()+"\n");
		}
		
		System.out.println("Reflection of java fields:.....\n");
		Field[]f=obj.getDeclaredFields();
		for(Field d:f) {
			System.out.println(d.getName());
			System.out.println(Modifier.toString(d.getModifiers()));
			System.out.println(d.getType());
		}
		
		
		
	}
}
