package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		int i=0,total=0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("input num:");
			i=scan.nextInt();
			
			if(i==0) {
				scan.close();
				break;
			}
			total +=i;
		}
	System.out.println("total:"+total);
	}
}
