package com.kita.first.level2.practice;

public class Practice10 {
	public static void main(String[] args) {
		int[] arr=new int[9];;
		int i=0;
		
		while(i<9) {
			int n  = (int)(Math.random()*9+1);
			arr[i++]=n;
			
		}
		
		
		for(int var : arr) {
			System.out.print(var+" ");
		}	
		System.out.println();
		
		for(int a=0;a<arr.length-1;a++) {
			for(int k=0;k<arr.length;k++ ) {
				while(true) {
					if(a==k) {
						break;
					}
					if(arr[a]==arr[k]) {
						int l  = (int)(Math.random()*9+1);
						arr[k]=l;
						
						}else {
							break;
						}
					
				}
			}
		}	
	
		
		
		
		
		for(int var : arr) {
			System.out.print(var+" ");
		}	
	
		
	}
}
