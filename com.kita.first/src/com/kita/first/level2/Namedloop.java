package com.kita.first.level2;

public class Namedloop {
	public static void main(String[] args) {
		Parent:
		for(int i = 0; i<5;i++) {
			Child:
			for(int j=0;j<3;j++) {
				if(j==1) {
					break;//continue Parent;
				}
				System.out.printf("i: %d z : %d\n",i,j);
			
			}

		}
	}
}
