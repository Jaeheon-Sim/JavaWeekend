package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n=Math.random();//0~0.9999까지 난수를 하나 발생
						// 0<=n<1
		System.out.println(n);
		
		
		int n1= (int)(Math.random()*10+1);
		System.out.println(n1);
		
		int n3=(int)(Math.random()*5+1);//1~5
		System.out.println(n3);
		
		int n4=(int)(Math.random()*12+2);//2~13
		System.out.println(n4);
		
		int n5=(int)(Math.random()*35+17);//17~51
		System.out.println(n5);
		
		int max=51;
		int min=17;
		int rnum=(int)(Math.random()*(max-min+1)+min);
		
	}
}
