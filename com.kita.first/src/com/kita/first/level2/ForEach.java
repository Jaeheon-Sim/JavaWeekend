package com.kita.first.level2;

public class ForEach {
	public static void main(String[] args) {
		int[] arr= {34,67,2,11,6,90};
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int val : arr) {
			System.out.print(val+" ");
			
		}
	
		
	}
}
 