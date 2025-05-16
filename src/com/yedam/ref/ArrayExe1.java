package com.yedam.ref;

public class ArrayExe1 {
	public static void main(String[] args) {
		
		int[] scoreAry = new int[10];
		
		System.out.print("{ ");
		for (int i = 0; i < scoreAry.length; i++) {
			scoreAry[i] = (int) (Math.random() * 91) + 10;
			System.out.printf("%d ",scoreAry[i]); 
		}
		System.out.print("}\n");


		double avg = 0;
		int max = scoreAry[0];
		for (int i = 0; i < scoreAry.length - 1; i++) {
			avg += scoreAry[i];
			
			if (max < scoreAry[i + 1]) {
				max = scoreAry[i + 1];
			}
		}
		
		avg /= scoreAry.length;
		
		System.out.printf("평균 : %.1f, 최대값 : %d\n", avg, max);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void test() {
		int[] intAry = {10, 24, 55, 31, 22, 17};
		
		int temp = 0;
		for(int i = 0; i < (intAry.length - 1); i++) {
			for(int j = 0; j < (intAry.length - 1); j++) {
				if (intAry[j] < intAry[j + 1]) {
					temp = intAry[j + 1];
					intAry[j + 1] = intAry[j];
					intAry[j] = temp;
				}
			}
		}
	}
}
