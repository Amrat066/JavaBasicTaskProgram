package practical1;

import java.util.Scanner;

public class MaxMinArray {
	
	static int Max(int[]arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	static int min(int[]arr) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}return min;
		
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:=");
		int n=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the number of array:");
			arr[i]=sc.nextInt();
		}
		int max=Max(arr);
		int min=min(arr);
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			else {
//				if(arr[i]<min) {
//					min=arr[i];
//				}
//			}
//		}
		System.out.println("the maximum number is:="+max);
		System.out.println("the mininmum number is:="+min);
	}
}
