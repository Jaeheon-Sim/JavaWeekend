package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {

//		자판기게임

//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스

//		가격: 900, 700, 400, 500, 600, 1000

//

//		--메뉴--

//		1. 콜라 900원

//		2. 사이다 700원

//		.

//		.

//		.

//		6. 웰치스 1000원

 

//		메뉴를 입력하세요(0 입력 시 종료): 1

//		콜라 900원

//		메뉴를 입력하세요(0 입력 시 종료): 3

//		캔커피 400원

//		.

//		.

//		.

//		메뉴를 입력하세요(0 입력 시 종료): 0

//		합계: 3700원

 

		Scanner scan = new Scanner(System.in);

		String[] menuArr = new String[6];

		int[] priceArr = new int[6];

		int total=0;

		priceArr[0]=900;

		priceArr[1]=700;

		priceArr[2]=400;

		priceArr[3]=500;

		priceArr[4]=600;

		priceArr[5]=1000;

		menuArr[0]="콜라";

		menuArr[1]="사이다";

		menuArr[2]="캔커피";

		menuArr[3]="데자와";

		menuArr[4]="환타";

		menuArr[5]="웰치스";

		int k=0;

		while(k==0) {

		System.out.println("메뉴를 입력하세요");
		int num=scan.nextInt();
		
		if(num<0 || num>menuArr.length) {
			System.out.println("범위 초과");
		}
		switch(num) {

			case 0:

				System.out.println("종료");

				System.out.println("합:"+total);

				k=1;

				scan.close();

				break;

			case 1:

				System.out.println(menuArr[0]+ priceArr[0]+"원");

				total=total+priceArr[0];

				continue;

			case 2:

				System.out.println(menuArr[1]+ priceArr[1]+"원");

				total=total+priceArr[1];

				break;

			case 3:

				System.out.println(menuArr[2]+ priceArr[2]+"원");

				total=total+priceArr[2];

				break;

			case 4:

				System.out.println(menuArr[3]+ priceArr[3]+"원");

				total=total+priceArr[3];

				break;

			case 5:

				System.out.println(menuArr[4]+ priceArr[4]+"원");

				total=total+priceArr[4];

				break;

			case 6:

				System.out.println(menuArr[5]+ priceArr[5]+"원");

				total=total+priceArr[5];

				break;

		}

	}

}}
