package com.yedam.operator;

import java.util.Scanner;

public class ScannerExe {
	
	private static int balance = 0;
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while(true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			int menu = scn.nextInt();
			
			switch (menu) {
				case 1:
					Deposit();
					break;
				case 2:
					Withdraw();
					break;
				case 3:
					Check();
					break;
				default:
					if (menu != 4) {
					 System.out.println("1~4번 사이의 숫자를 선택하세요.");	
					}
					break;
			}
			
			if (menu == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
	}
	public static void Deposit() {
		
		Scanner input = new Scanner(System.in);
	
		while(true) {
			System.out.print("입금액 입력 >> ");
			int deposit = input.nextInt();
			if (deposit > 0 && deposit <= 100000) {
				balance += deposit;
				System.out.printf("%d원 입금완료\n총 계좌 잔액 %d원\n", deposit, balance);
				break;
			}else if(deposit > 100000) {
				System.out.println("10만원 초과 입금 불가");
			}else {
				System.out.println("입금이 확인되지 않습니다.");
			}
		}
	}
	
	public static void Withdraw() {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("출금액 입력 >> ");
			int withdraw = input.nextInt();
			if (balance < withdraw) {
				System.out.println("잔액부족");
				break;
			}else {
				balance -= withdraw;
				System.out.printf("%d원 출금되었습니다.\n총 계좌 잔액 %d원\n", withdraw, balance);
				break;
			}
		}
	}
	
	public static void Check() {
		
		System.out.printf("현재 계좌 잔액 %d원\n", balance);
	}
	
}
