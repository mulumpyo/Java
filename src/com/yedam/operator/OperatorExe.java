package com.yedam.operator;

import java.util.Scanner;

public class OperatorExe {

	public static void main(String[] args) {
		test5();
	}
	
	public  static void test() {
		byte num1 = -128;
//		num1--;
		num1++;
		System.out.println(num1);
		
		
		char ch1 = 'A';
		int b = ch1;
		System.out.println(b);
		
		
		char ch2= '가';
		
		ch2 = 0x29D7;
		
		for(int i = 1; i <= 26; i++) {
			System.out.println(ch2++);
		}
	}
	
	public static void test1() {
		byte num1 = 127;
		byte num2 = 1;
		byte sum = (byte) (num1 + num2);
		System.out.println(sum);
	}
	
	public static void test2() {
		int num1 = 10;
		int num2 = 20;
		int result = ++num1 + num2++;
		
		System.out.printf("num1 => %d, num2 => %d, result => %d\n", num1, num2, result);
		
		boolean isTrue = false;
		if(!isTrue) {
			System.out.println("참입니다.");
		}
		
		result = 30;
		
		if(!(result != 30)) {
			System.out.println("sdadsasd");
		}
	}
	
	public static void test3() {
		boolean isTrue = true;
		for(int i = 1; i <= 10; i++) {
			if(isTrue) {
				System.out.printf("%d\n", i);	
			}
			isTrue = !isTrue; // Toggle
		}
	}
	
	public static void test4() {
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("출력하고자 하는 월의 숫자를 입력하세요.");
//		int input = scn.nextInt();
//		System.out.println();
		
		for(int input = 1; input < 13; input++) {
			
			System.out.println();
			
			System.out.printf("%13s%2d월\n"," ", input);
		
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			int space = getSpace(input);
			int last_date = getLastDate(input);
			
			for(int s = 1; s <= space; s++)
				System.out.printf("%4s", " ");
			
			for(int day = 1; day <= last_date; day++) {
				System.out.printf("%4d", day);
				if ((day + space) % 7 == 0 ) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
	
	public static int getSpace(int month) {
		int space = 0;
		switch (month) {
			case 1:
				space = 3;
				break;
			case 2:
				space = 6;
				break;
			case 3:
				space = 6;
				break;
			case 4:
				space = 2;
				break;
			case 5:
				space = 4;
				break;
			case 7:
				space = 2;
				break;
			case 8:
				space = 5;
				break;
			case 9:
				space = 1;
				break;
			case 10:
				space = 3;
				break;
			case 11:
				space = 6;
				break;
			case 12:
				space = 1;
				break;
		}
		return space;
	}
	
	public static int getLastDate(int month) {
		int last_day = 31;
		
		switch (month) {
		case 2:
			last_day = 28;
			break;
		case 4:
			last_day = 30;
			break;
		case 6:
			last_day = 30;
			break;
		case 9:
			last_day = 30;
			break;
		case 11:
			last_day = 30;
			break;
	}
	return last_day;
		
	}
	
	public static void test5() {
		String isPass= new String();
		
		int score = (int) (Math.random() * 100);
		isPass = (score >= 80) ? "우수" : (score >= 60) ? "합격" : (score < 20) ? "불불합격" : "불합격";
		System.out.printf("%d점은 %s\n", score, isPass);
	}
	
	
}
