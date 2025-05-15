package com.yedam.condition;


import java.util.Scanner;

public class IfExe {
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Score값 입력 >> ");
//		int score = input.nextInt();
//		
//		TestIf(score);
//		TestCase(score);
		
		int randomValue = (int) ((Math.random() * 1000) + 1);
		Scanner input = new Scanner(System.in);
		int cnt = 1;
		
//		System.out.println(randomValue);
		
		while(true) {
			System.out.print("1 ~ 1000 사이의 숫자를 입력하세요. >> ");
			int num = input.nextInt();
			if(num > 0 && num <= 1000) {
				if (num > randomValue) {
					System.out.println("입력값보다 작습니다.");
				} else if (num < randomValue) {
					System.out.println("입력값보다 큼니다.");
				} else {
					if(cnt <= 5) {
						System.out.println("좀 치시네요.");
					} else if(cnt <= 10) {
						System.out.println("잘하셨어요.");
					} else if(cnt <= 15) {
						System.out.println("분발하세요.");
					} else {
						System.out.println("축하드려요. 멍청하시네요.");
					}
					break;
				}
				
				cnt++;
			} else {
				System.out.print("다시 입력하세요.\n");
			}
		}
		System.out.println("총 시도한 횟수 " + cnt);
	}
	
	
	
	
	
	public static void TestIf(int score) {

		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("불합격");
		}
	}
	
	public static void TestCase(int score) {
		
		score /= 10;
		
		switch (score) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("불합격");
		}
	}
}
