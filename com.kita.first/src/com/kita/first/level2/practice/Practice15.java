package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice15 {
	public static void main(String[] args) {
		
		int[] randomarr= {0,0,0};
		int[] inarr= {0,0,0};
		int strike = 0;
		int cnt=0;
		random(randomarr);
		
		while(strike != 3) {
			inputarr(inarr);
			strike=check(inarr,randomarr);
			cnt++;
		}
		System.out.println("!!!!!!!!!!!!!!");
		System.out.println(cnt+"È¸");
		
	}
	
	public static void random(int randomarr[]) {
		for(int i=0;i<randomarr.length;i++){
			randomarr[i]=(int)(Math.random()*10+1);
			for(int j=0;j<i;j++) {
				while(true) {
					if(randomarr[i]==randomarr[j]){
						randomarr[i]=(int)(Math.random()*10+1);
					}else {
							break;
					}
				}
			}
		}
	}
	
	public static void inputarr(int arr[]) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("ÀÔ·Â:");
			arr[i]=scan.nextInt();
		}
	} 
	
	public static int check(int inarr[],int ranarr[]) {
		int strike=0;
		int ball=0;
		
		for(int i =0;i<ranarr.length;i++) {
			for(int j=0;j<ranarr.length;j++) {
				
				if(inarr[i]==ranarr[j]&&i==j) {
						strike+=1;
					} 
				if(inarr[i]==ranarr[j]&&i!=j){
						ball+=1;
					}
				}	
			}
			
		System.out.println("strike:"+strike+" ball:"+ball+" out:"+(3-(ball+strike)));
		return strike;
	}
	
			
}

