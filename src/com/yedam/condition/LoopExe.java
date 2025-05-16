package com.yedam.condition;

import java.util.Scanner;



public class LoopExe {
	
	private static boolean result = true;
	
	public static void main(String[] args) {
		
		String WinMSG = new String("You win");
		String LoseMSG = new String("You lost");
		String SameMSG = new String("You lost");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int randomLsp = (int) ((Math.random() * 3) + 1);
			System.out.print("가위(1) 바위(2) 보(3) >> ");
			int userRsp = input.nextInt();
			if (userRsp < 1 || userRsp > 4) {
				System.out.println("다시 입력하세요.");
			} else if(userRsp == 4) {
				System.out.println("가위 바위 보 끝");
				break;
			} else {
				System.out.println("사용자 : " + rspString(userRsp) + "\n" + "컴퓨터 : " + rspString(randomLsp) );
				if (userRsp == randomLsp) {
					System.out.println(SameMSG);
				} else {
					result = whoWin(userRsp, randomLsp);
					if (result) {
						System.out.println(WinMSG);
					} else {
						System.err.println(LoseMSG);
					}
				}
			}
			
		}
		
	}
	
	public static boolean whoWin(int user, int random) {
		
		switch(user) {
			case 1:
				if(random == 2) {
					return false;
				} else {
					return true;
				}
			case 2:
				if(random == 3) {
					return false;
				} else {
					return true;
				}
			case 3:
				if(random == 1) {
					return false;
				} else {
					return true;
				}
			default:
				return false;
		}
				
	}
	
	public static String rspString(int num) {
		return num == 1 ? "가위": num == 2 ? "바위" : "보";
	}
}

