package practical1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
public class FIleHandling {
	
	
	public static void main(String args[]) throws Exception {
		
//		FileReader file=new FileReader("/home/agm6/Documents/hello.txt");
//		int i;
//		while(file.ready()) {
//			i=file.read();
//		System.out.print(" "+i);
//			
//			char c=(char)i;
//			System.out.print(c);
//			
//			file.close();		
		
		byte[] buffer= {66,67,89,90};
//		
//		ByteArrayInputStream i=new ByteArrayInputStream(buffer);
//		int m;
//		while((m=i.read())!=-1){
//			
//			char c=(char)m;
//			System.out.println(c);
//		
//		}
		
//		InputStream file=new FileInputStream("/home/agm6/Documents/hello.txt");
//		   int i=0;    
//           while((i=file.read())!=-1){    
//        	   
//            System.out.print((char)i);    
//            
//           }
           
        FileOutputStream out=new FileOutputStream("/home/agm6/Documents/hii.txt");
        ByteArrayOutputStream k=new ByteArrayOutputStream();
        	k.write(buffer);
        	k.writeTo(out);
        System.out.println(k);
       
		
	}

}
