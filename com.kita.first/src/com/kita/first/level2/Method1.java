package com.kita.first.level2;

public class Method1 {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 =3;
		System.out.println(n1+n2);
		Method1.sum(2,3);
		
		System.out.println(Method1.minus(3,2));
	}
	
	public static int sum(int n1,int n2) {
		
		return n1+n2;
	}

	public static int minus(int n1,int n2) {
		
		return n1-n2;
	}

}


//public static ����Ÿ�� �޼ҵ��() {
//	return ����Ÿ��
//}
//
//public static void �޼ҵ��() {}