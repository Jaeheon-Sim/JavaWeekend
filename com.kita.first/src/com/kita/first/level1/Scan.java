package com.kita.first.level1;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		int num = scan.nextInt();	
		System.out.println(num);
		System.out.println("input String: ");
		String str = scan.next();
		System.out.printf("%s",str);
		scan.close();
	}
	
}
