package com.kita.first.level1;

public class Printf {
	public static void main(String[] args) {
		String name = "sim";
		int age = 23;
		
		System.out.println("name: "+name+"\nage: "+age);
		System.out.printf("name: %s \nage: %d\n",name,age);
		
		double grade = 3.333333333333;
		System.out.printf("my grade: % 2f\n",grade);
	}
}
