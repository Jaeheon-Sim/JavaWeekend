package com.kita.first.level1;

public class Equals {
	public static void main(String[] args) {
		
//		int n1 =2;
//		int n2 = 3;
//		int n3 = 3;
//		
//		boolean reseult1 = (n1 == n2);
////		System.out.println(result1);
//		
//		boolean result2 = (n1 != n2);
//		System.out.println(result2);
//		
//		boolean result3 = ((n1 != n2) || (n2 == n3));
//		System.out.println("result3: "+result3);
		
		String str1 = "hi";
		String str2 = "hi";
		String str3 = new String("hi");
		
//		boolean result4 = (str1 == str2);
//		System.out.println(result4);
//		boolean result5 = (str1 == str3);
//		System.out.println(result5);
		
		
		boolean result6 =(str1.equals(str3));
		boolean result7 =("hi".equals(str3));
		
		System.out.println(result6);
		System.out.println(result7);
	}
}
