package com.kita.first.level1.practice;

import java.util.Scanner;

public class Pratice03 {
	public static void main(String[] args) {
		
		int grade=0;
		int average1=60,average2=70;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input type(가/나): ");
		String type=scan.next();
		System.out.print("input grade: ");
		grade=scan.nextInt();
		scan.close();
		
		
		if("가".equals(type)){
			if(grade>average1) {
				System.out.println("over than average");
				
			}else if(grade<average1) {
				System.out.println("under than average");
			}else {
				System.out.println("average ");
				
			}	
			
		}else if("나".equals(type)){
			if(grade>average2) {
				System.out.println("over than average");
				
			}else if(grade<average2) {
				System.out.println("under than average");
			}else {
				System.out.println("average");
			}	
			
		}
		else {
			System.out.println("false");
		}
	}
}
