package com.yedam;

import java.util.Scanner;

public class JSExe {
	public static void main(String[] args) {
		
		
//		// promotion, cascating
//		
//		int num1 = 30;
//		int num2 = 30;
//		
//		String str1 = new String("Hello");
//		String str2 = new String("Hello");
//		
//		char char1 = 'H';
//		char char2 = 'H';
//		
//		System.out.println(char1 == char2 );
//		
//		System.out.println(num1 == num2);
//		System.out.println(str1.equals(str2)); // 문자열 변수의 데이터값 비교시 "변수명.equals(비교하려는 변수명)
//		// 문자열 String은 참조 데이터
		
//		String str3 = "30";
//		int num3 = 30;
//		
//		System.out.println(str3.equals("" + num3)); // 연산을 위해 promotion 
//		int num4 = Integer.parseInt(str3); // cascating?
//		
//		System.out.println(num3 == num4);
//		
		test5();
	}
	
	
	
	
	
	
	public static void test4() {
		Scanner input = new Scanner(System.in);
		String str = new String("친구목록은 ");
		
		int cnt = 0;
		while (true) {
			System.out.println("친구 이름 입력, 죵료 = quit >>");
			String msg = input.nextLine();
			if (cnt == 0) {
				str += msg;
			} else if (msg.equals("quit")) {
				str += " 입니다.";
				break;
			} else {
				str += ", " + msg;
			}
			cnt++;
		}
		System.out.println(str);
	}
	
	
	public static void test5() {
		
//		System.out.printf("%s\n%d\t%.2f\n", "문자", 30, 52.587);
//		System.out.printf("%s, %d, %.1f\n", "홍길동", 100, 23.9);
		System.out.printf("안녕하세요. %s입니다.\n나이는 %d세입니다.\n몸무게는 %.1f입니다.\n\n", "이창호", 20, 67.8);
		
		String formatStr = "안녕하세요. %s입니다.\n";
		formatStr += "나이는 %d세입니다.\n";
		formatStr += "몸무게는 %.1f입니다.\n";
		System.out.printf(formatStr, "이창호", 20, 67.8);
				
	}
	
	
	
	
	
	
	
	
	
	public static void test3() {

		Scanner scn = new Scanner(System.in);
		int i;
		int sum = 0;
		for (i = 0; i < 3; i++) {
			System.out.println("학생의 점수를 입력 >> ");
			String value = scn.nextLine();
			int score = Integer.parseInt(value);
			sum += score;
		}
		double avg = sum / i;
		avg = Math.round(avg * 100) / 100.0;
	}
	
	public static void test2() {

		int sum = 0;
		int cnt;
		for (cnt = 0; cnt < 7; cnt++) {
			int randomNum = (int) (Math.random() * 71) + 30;
			sum += randomNum;
			System.out.println(randomNum);
		}
		double result = Math.round(((double) sum / cnt) * 100) / 100.0;
		System.out.println(result);
	}
}