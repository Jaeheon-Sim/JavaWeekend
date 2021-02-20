package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice13 {
	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		int l=1;
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				arr[i][k]=l++;
			
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		}
}
