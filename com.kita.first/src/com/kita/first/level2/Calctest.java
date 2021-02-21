package com.kita.first.level2;

public class Calctest {
	public static void main(String[] args) {
		Calc.poweron();
		
		System.out.println(Calc.sum(1,2));
		System.out.println(Calc.minus(3, 1));	
		System.out.println(Calc.div(13, 2));
		System.out.println(Calc.minus(2, 15));
		System.out.println(Calc.div(5, 3));
		Calc.poweroff();
	}
}
