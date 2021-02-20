package com.kita.first.level2;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=1;
				
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
