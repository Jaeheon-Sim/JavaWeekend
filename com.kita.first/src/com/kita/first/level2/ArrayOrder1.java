package com.kita.first.level2;

public class ArrayOrder1 {
	public static void main(String[] args) {
		int[] arr= {34,67,2,11,6,90};
		int temp=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	
		for(int val :arr) {
			System.out.print(val+" ");
		}
		
	
	}
}