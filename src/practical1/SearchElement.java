package practical1;

public class SearchElement {
	public static void main(String args[]) {
		
		
		int[] array= {1,2,3,4,5,6};
		int value=5;
		boolean found=false;
		for(int i=0;i<array.length;i++) {
			if(i==value)
			{
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("the value is found in the array:" +found);
		}
		else {
			System.out.println("the value is not found in the array");
		}
		
	}

}
