package com.yedam;

import java.util.Scanner;


// java로 끝나는 파일을 저장 및 컴파일하면 class라는 파일로 변환되어 실행
public class Comments {
	
	public static void main(String[] args) {
		
		// 실행시 프로그램 메소드 중 "main"을 가장 먼저 찾고 실행!
		
		
		
		// 변수 데이터 타입
		// int : 정수
		// double : 실수
		// String : 문자"열" 참조형 변수
		// char : 문자
		
		
		// 자바스크립트랑 다르게 변수 마다 데이터 형에 맞는 변수 선언해야함
		
		int int_a = 5; // 정수형 변수 선언(초기화) 방법
		
		double double_b = 2.4; // 정수형 변수 선언(초기화) 방법
		
		String str_c = new String("메렁"); // 문자'열' 저장
		
		char char_d = 'A'; // 문자 저장
		
		System.out.println(); // 자바스크립트의 console.log(); (출력하는 함수)		
		// !!!!!!!!!!!!!!!!!!!!!!
		// String 변수 str_c를 출력하면 "메렁" 값이 나오지만 비교할 때엔 변수가 저장된 주소값이 나오므로
		// 문자열 끼리 비교할 땐 아래와 같이
		// 비교할 데이터.equals(비교할 데이터2);
		
		// 데이터가 자동으로 형변환 되는 것을 보고 Promotion 이라고 부른다.
		
		double test_double = 2.1;
		int test_int = 1;
		double result = test_double + test_int;
		System.out.println(result); // result = 3.1  # int가 자동으로 실수 (double) 형태로 자동 형변환
		String test_str = new String("바보");
		System.out.println("바보" + test_double + test_int); // double 형과 int 형 데이터들이 문자들과 연산을 하게되면 문자형태로 변환
		System.out.println("바보" + (test_double + test_int)); // 자동 형변환을 막기 위해 괄호로 선위 연산하면 후에 문자랑 연산
		
		
		
		
		// 데이터를 강제로 형변환 하는 것을 보고 Cascading 이라고 부른다.
		int result2 = (int) test_double + test_int;
		System.out.println(result2); // result = 3 # test_double 변수를 강제로 정수(int) 형태로 변환
		

		
		//숫자를 문자로 바꾸기
		System.out.println(result2 + "");
		
		
		//문자를 정수형으로 바꾸기
		String str_to_int = new String("30");
		int parse_int = Integer.parseInt(str_to_int);
		
		
		Scanner scn = new Scanner(System.in); // 자바스크립트의 prompt(); (입력하는 함수)
		String value = scn.nextLine(); // 실질적으로 입력을 받아 value 변수에 저장하는 부분
		
		// !!!!!!!!!!!!!!!!!!!!!!
		// Scanner 사용시 package 아래 java.util.Scanner을 import하여 줘야함
	
	} 

}
