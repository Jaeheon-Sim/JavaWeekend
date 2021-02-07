package com.kita.first.level2.practice;
			
			
import java.util.Scanner;		

public class Practice07 {			

		public static void main(String[] args) {			
			int i,j;
			i=(int)(Math.random()*81+10);		
			Scanner scan = new Scanner(System.in);
												
			while(true) {
				System.out.println("input: ");
				j=scan.nextInt();			
									
				if(j<i) {			
					System.out.println("UP");
									
				}				
				else if(j>i) {		
					System.out.println("DOWN");	
													
				}			
				else{			
					System.out.println("GREAT");
					break;	
				}
			}
		scan.close();
		}
		
}
