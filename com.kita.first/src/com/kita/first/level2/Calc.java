package com.kita.first.level2;

public class Calc {
	
	public static void poweron () {
		System.out.println("on");
	}

	public static void poweroff () {
		System.out.println("off");
	}
	
	public static int sum(int a, int b) {
		return   a+b;
	}
	
	public static double sum(double a, double b) {
		return   a+b;
		
	}
	
	public static int sum(int...arr) {
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			
		}
		return total;
	}
	
	public static int minus(int a, int b) {
		return  (a>b) ? a-b: b-a;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static double div(int a, int b) {
		return (double)a/b;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

	
	
}
