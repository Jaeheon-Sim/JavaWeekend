package com.kita.first.level2.practice;

public class Practice14 {
	public static void main(String[] args) {
		
		int[][] grade = {{67,49,87},{89,92,56},{76,39,98}};
		//국 영 수 합 ,평균 
		//성적 합 배열
		String[] cls= {"국어","수학","영어"};
		int[] gradesum=new int[3];
		double totalsum =0;
		for(int i=0;i<grade.length;i++) {
			double total = 0;
			for(int j=0;j<grade[i].length;j++) {
				
				total += grade[i][j];
				gradesum[i]=(int)total;
			}
			if(i==0) {
				System.out.println(cls[i]+" 합:"+gradesum[i]);
				System.out.printf( "%s 평균: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();
			}else if(i==1) {
				System.out.println(cls[i]+" 합:"+gradesum[i]);
				System.out.printf( "%s 평균: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();
			}else {
				System.out.println(cls[i]+" 합:"+gradesum[i]);
				System.out.printf( "%s 평균: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();		
			}
			totalsum+=total;
			System.out.println();
		}
		System.out.println("전체 합:"+(int)totalsum);
		System.out.printf("전체 평균: %.1f",totalsum/(grade.length*grade[0].length));
	}
}
