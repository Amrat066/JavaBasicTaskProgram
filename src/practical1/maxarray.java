package practical1;

public class maxarray {

	public static void main(String[] args) {
		
		int[]a= {1,2,34,56,90};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int r=a[a.length-2];
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(r);

	}

}
