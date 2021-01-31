package com.kita.first.level1.practice;

import java.util.Scanner;

public class Pratice02 {
	public static void main(String[] args) {
		//Á¤¼ö°ª ÀÔ·Â,È¦ Â¦ ±¸ºÐ
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input num: ");
		int num = scan.nextInt();
		scan.close();
		if(num%2==0) {
			System.out.println("even");
			
		}else{
			System.out.println("odd");
			
		}
		
	
	}
}
