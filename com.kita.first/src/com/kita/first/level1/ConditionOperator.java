package com.kita.first.level1;

import java.util.Scanner;

public class ConditionOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("input: ");
		int num = scan.nextInt();
		
		if(num%2==0){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	scan.close();
	//(���ǽ�)? true: false;//���� ������
	
	
//	snum = (num%2==1)? Ȧ��:¦��;	
//	System.out.println(snum);
	}
}
