package com.yedam.ref;

public class NullExe {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
//		System.out.println(str2);
		
		int[] ary = {10, 20, 30};
		int[] intAry;
		intAry = new int[] { 40, 50, 60 };
		
//		System.out.printf("ary배열의 크기 %d\n", ary.length);
		
		
		intAry[0] = 400;
		intAry[2] = 10;
		
		for(int i = 0; i < 3; i++) {
//			System.out.println(intAry[i]);
		}
		

		intAry = new int[5];
		for(int i = 0; i < intAry.length; i++) {
//			System.out.printf("%d\n", intAry[i]);
		}
		
		double[] dblAry = {10.2, 23.2, 34.5};
		
		for(int i = 0; i < dblAry.length; i++) {
//			System.out.printf("%.1f\n", dblAry[i]);
		}
		
		String[] strAry = new String[10];// { "Hello", "World" };
//		strAry = new String[] {"Hello", "World"};
		for(int i = 0; i < strAry.length; i++) {
			System.out.printf("%s", strAry[i]);
		}
	}
}
