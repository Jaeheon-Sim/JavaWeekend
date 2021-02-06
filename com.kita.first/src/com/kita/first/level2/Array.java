package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int arr1[] = new int[5];
//		int[] arr = new int[5]
		//기본형 변수들의 기본값 
		//숫자형 : 0
		//char: (빈값)
		//boolean: false
		
		//참조형 변수의 기본값: NULL
		
		char[] arr2= new char[10];
		double[] arr3=new double[10];
		String[] arr4=new String[10];
 	
		arr1[0]=1;
		//System.out.println(arr1[0]);
		arr1[2]=5;
		//System.out.println(arr1[2]);
		
		int[] arr7= {1,2,3,4,5};
		arr7= new int[] {1,2,3};
		
		int len = arr1.length;
		for(int i=0;i<len;i++) {
			arr1[i]=3;
		}
		for(int i=0;i<len;i++) {	
			System.out.print(arr1[i]+"");
		}
	}
}
