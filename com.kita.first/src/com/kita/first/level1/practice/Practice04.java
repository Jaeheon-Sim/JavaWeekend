package com.kita.first.level1.practice;

import java.util.Scanner;

public class Pratice04 {
	public static void main(String[] args) {
		int i=0,num=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("input: ");
		i=scan.nextInt();
		scan.close();
		
		if(i%2==0) {
			num=1;
		}else {
			num=0;
		}
		
		
		switch(num) {
		
		case 1 :
			System.out.println("even");
			break;
		case 2 :
			System.out.println("odd");
			break;
		}
	}
}
