package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {

//		���Ǳ����

//		�޴�: �ݶ�, ���̴�, ĵĿ��, ���ڿ�, ȯŸ, ��ġ��

//		����: 900, 700, 400, 500, 600, 1000

//

//		--�޴�--

//		1. �ݶ� 900��

//		2. ���̴� 700��

//		.

//		.

//		.

//		6. ��ġ�� 1000��

 

//		�޴��� �Է��ϼ���(0 �Է� �� ����): 1

//		�ݶ� 900��

//		�޴��� �Է��ϼ���(0 �Է� �� ����): 3

//		ĵĿ�� 400��

//		.

//		.

//		.

//		�޴��� �Է��ϼ���(0 �Է� �� ����): 0

//		�հ�: 3700��

 

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

		menuArr[0]="�ݶ�";

		menuArr[1]="���̴�";

		menuArr[2]="ĵĿ��";

		menuArr[3]="���ڿ�";

		menuArr[4]="ȯŸ";

		menuArr[5]="��ġ��";

		int k=0;

		while(k==0) {

		System.out.println("�޴��� �Է��ϼ���");
		int num=scan.nextInt();
		
		if(num<0 || num>menuArr.length) {
			System.out.println("���� �ʰ�");
		}
		switch(num) {

			case 0:

				System.out.println("����");

				System.out.println("��:"+total);

				k=1;

				scan.close();

				break;

			case 1:

				System.out.println(menuArr[0]+ priceArr[0]+"��");

				total=total+priceArr[0];

				continue;

			case 2:

				System.out.println(menuArr[1]+ priceArr[1]+"��");

				total=total+priceArr[1];

				break;

			case 3:

				System.out.println(menuArr[2]+ priceArr[2]+"��");

				total=total+priceArr[2];

				break;

			case 4:

				System.out.println(menuArr[3]+ priceArr[3]+"��");

				total=total+priceArr[3];

				break;

			case 5:

				System.out.println(menuArr[4]+ priceArr[4]+"��");

				total=total+priceArr[4];

				break;

			case 6:

				System.out.println(menuArr[5]+ priceArr[5]+"��");

				total=total+priceArr[5];

				break;

		}

	}

}}
