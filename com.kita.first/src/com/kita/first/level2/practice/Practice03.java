package com.kita.first.level2.practice;





public class Practice03 {
	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%2d\n",i,j,i*j);
			}
			System.out.println();
		}
	
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d=%2d\t",i,j,i*j);
			}
			System.out.println();
		}
//		int i=0,j=0;
//		while(i<=9) {
//			while(j<=9) {
//				System.out.printf("%d*%d=%2d\n",i,j,i*j);
//				j++;
//			}
//			System.out.println();
//			j=0;
//			i++;
//		}
//		i=0;
//		j=0;
//		
//		do {
//			
//		}while(i<10);
		
		
	}
}
