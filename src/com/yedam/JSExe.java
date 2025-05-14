package com.yedam;

public class JSExe {
	public static void main(String[] args) {
		int sum = 0;
		for (int cnt = 0; cnt <= 5; cnt++) {
			int randomNum = (int) ((Math.random() * 10) + 1);
			sum += randomNum;
		}
		System.out.println(sum);
	}
}