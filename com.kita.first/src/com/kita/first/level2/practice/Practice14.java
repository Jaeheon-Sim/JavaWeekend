package com.kita.first.level2.practice;

public class Practice14 {
	public static void main(String[] args) {
		
		int[][] grade = {{67,49,87},{89,92,56},{76,39,98}};
		//�� �� �� �� ,��� 
		//���� �� �迭
		String[] cls= {"����","����","����"};
		int[] gradesum=new int[3];
		double totalsum =0;
		for(int i=0;i<grade.length;i++) {
			double total = 0;
			for(int j=0;j<grade[i].length;j++) {
				
				total += grade[i][j];
				gradesum[i]=(int)total;
			}
			if(i==0) {
				System.out.println(cls[i]+" ��:"+gradesum[i]);
				System.out.printf( "%s ���: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();
			}else if(i==1) {
				System.out.println(cls[i]+" ��:"+gradesum[i]);
				System.out.printf( "%s ���: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();
			}else {
				System.out.println(cls[i]+" ��:"+gradesum[i]);
				System.out.printf( "%s ���: %.1f",cls[i],(double)gradesum[i]/grade[i].length);
				System.out.println();		
			}
			totalsum+=total;
			System.out.println();
		}
		System.out.println("��ü ��:"+(int)totalsum);
		System.out.printf("��ü ���: %.1f",totalsum/(grade.length*grade[0].length));
	}
}
