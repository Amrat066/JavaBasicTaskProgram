package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        MyClass s = new MyClass(101, "amrat", "surat");
        Class myclass = s.getClass();

        // Print fields
        Field[] fields = myclass.getDeclaredFields();
        for (Field field : fields) {
        	field.setAccessible(true);
            System.out.println(field.getName() + "");
        }
        //constructor fields

        Constructor []c=myclass.getDeclaredConstructors();
        for(Constructor v:c) {
        	System.out.println("the name of the method is:="+v.getName());
        }
        
        //Methods
        Method []m=myclass.getDeclaredMethods();
        for(Method k:m) {
        	System.out.println("the method is:="+k.getName());
        }
        // Invoke show method
//        Method myMethod = myclass.getDeclaredMethod("show");
//        myMethod.invoke(s);
        
        Method[]t=myclass.getDeclaredMethods();
        for(Method d:t) {
        	System.out.println(d.invoke(s));
        }
        //Class x=(Class) myclass.newInstance();
    }
}

class MyClass {
    private int id;
    private String name;
    private String address;

    MyClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
   

    public void show() {
        System.out.println("the id is:=" + this.id);
        System.out.println("the name is:=" + this.name);
        System.out.println("the address is:=" + this.address);
    }
   
   
}
