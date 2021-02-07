package com.kita.first.level2;

import java.util.Scanner;

public class ArrayOrder2 {
	public static void main(String[] args) {
//		int[] arr= {34,67,2,11,6,90};
//		int temp=0;
//		int min=0;
//		
//		
//		for(int i=0;i<arr.length-1;i++) {	
//			min=i;
//			for(int j = i+1; j<arr.length;j++){
//				if(arr[min]>=arr[j]) {
//					min=j;
//				}
//			}
//				temp=arr[i];
//				arr[i]=arr[min];
//				arr[min]=temp;
//		}
//		
//		for(int val : arr) {
//			System.out.print(val+" ");	
		
		
//		int[] arr= {123,2345,2342,123,345};
//		int temp=0;
//		int max=0;
//		
//		for(int i=0;i<arr.length-1;i++) {
//			max=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[max]>arr[j]) {
//					max=j;
//				}
//			}
//			temp=arr[i];
//			arr[i]=arr[max];
//			arr[max]=temp;
//		}
//		
//		for(int val : arr) {
//			System.out.print(val+" ");	
//			
//		}
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		int i = scan.nextInt();
		scan.close();
		int a=0;
		
		
		for(int k=0;k<-i;k++) {
			
		a=k;
			for(int j=i+1;j<i;j++) {
				if(arr[a]<arr[j]) {
				temp=arr[a];
				arr[a]=arr[j];
				arr[j]=temp;
						
				
			}
			
		}
		
		for(int val : arr) {
			System.out.print(val+" ");	
			
	}
		
		
		}
	}
}

