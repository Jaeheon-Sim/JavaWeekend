package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice12 {
	public static void main(String[] args) {
		String[] arr1 = {"���","����","����","��","�ٳ���","���ڳ�"};
		String[] arr2=new String[arr1.length]; 
		//arr2 �� arr1 �� ����->���
		//arr2 ���� ����
		
		for(int i = 0 ; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		int k = arr2.length-1;
		for(int i = 0;i<arr2.length/2;i++) {
			String a= "0";
			a=arr2[i];
			arr2[i]=arr2[k];
			arr2[k--]=a;
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
}
