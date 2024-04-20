package wrapper;

public class wrapper {
		public static void main(String args[]) {
			//convert primitive to object
			
			int a=10;
			double d=12.3;
			
			Integer obj=a;
			Double obj2=d;
			
			System.out.println(obj);
			System.out.println(obj2);
			
			//convert object to primitive
			
			Integer i=Integer.valueOf(45);
			int j=i;
		
			
			System.out.println(j);
			
		}
	

}
