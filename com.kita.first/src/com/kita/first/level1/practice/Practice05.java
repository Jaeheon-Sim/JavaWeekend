package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input month(1~12): ");
		int month=scan.nextInt();
		//String month = scan.next();
		scan.close();
		
		switch(month) {
		
		case 1:
		case 12:
		case 2:
			System.out.println("winter");
			break;
		case 3: 
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;	
		case 9: 
		case 10:
		case 11:
			System.out.println("fall");
			break;
		default:
				System.out.println("wrong");
				break;
			
		
		
		}
	}
}
