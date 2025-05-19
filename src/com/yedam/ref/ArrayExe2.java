package com.yedam.ref;

public class ArrayExe2 {
	public static void main(String[] args) {
		int[][] intAry = { {17, 22, 31}, {28, 38, 12} };
		
		intAry[0][2] = 44;
		
//		for(int outter = 0; outter < intAry.length; outter++ ) {
//			for(int inner = 0; inner < intAry[outter].length; inner++ ) {
//				System.out.printf("intAry[%d][%d] = %d\n",outter, inner, intAry[outter][inner]);
//			}
//		}
		
		int[][] ary2 = new int[3][4];
		
		int sum = 0;
		for(int i = 0; i < ary2.length; i++) {
			for(int cnt = 0; cnt < ary2[i].length; cnt++) {
				ary2[i][cnt] = (int) (Math.random() * 100) + 1;
				System.out.printf("ary2[%d][%d] = %d\n", i, cnt, ary2[i][cnt]);
				if(i == 1) {
					sum += ary2[i][cnt];
					System.out.println(ary2[i][cnt] + " " + sum);
				}
			}
		}
		System.out.println(sum);
		
		
	}
}

