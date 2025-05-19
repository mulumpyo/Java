package com.yedam.ref;

import java.util.Scanner;

public class Register {
	
	static Usr[] usrRegister = null;
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String selectTXTFmt = "========== 회원가입 ==========\n(1) 회원가입\n(2) 정보수정\n(3) 회원 탈퇴\n(4) 회원 조회\n(5) 종료\n선택 >> ";
		boolean isRun = true;
		
		while(isRun) {
			
			System.out.print(selectTXTFmt);
			int selNum = Integer.parseInt(input.nextLine());
			
			switch(selNum) {
			case 1:
				if (usrAdd()) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}
				break;
			case 2:
				usrEdit();
				break;
			case 3:
				usrDel();
				break;
			case 4:
				usrList();
				break;
			case 5:
				input.close();
				isRun = false;
				break;
			default:
				System.out.println("1 ~ 5 사이의 숫자를 입력하여주세요.");
				break;
			}
		}
	}
	
	// 유저 추가
	public static boolean usrAdd() {
		for (int i = 0; i < usrRegister; i++) {
			System.out.print("아이디를 입력하세요. >> ");
			String id = input.nextLine();
			System.out.print("이름을 입력하세요. >> ");
			String name = input.nextLine();
			System.out.print("전화번호를 입력하세요. >> ");
			String tel = input.nextLine();
			
			Usr usr = new Usr();
			usr.usrId = id;
			usr.usrName = name;
			usr.usrTel = tel;
			if (usrRegister[i] == null) {
				usrRegister[i] = usr;
				return true;
			} else if (usrRegister[i].usrId == id) {
				System.out.println("아이디 중복");
				return false;
			} else {
				return false;
			}

		}
		return false;
	}
	
	// 유저 수정
	public static void usrEdit() {
	}
	
	// 유저 삭제
	public static void usrDel() {
		
	}
	
	// 유저 조회
	public static void usrList() {
		
	}
}
