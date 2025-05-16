package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe {
	
	
	public static void main(String[] args) {
		
//		strAry();
//		delAry();
//		friendApp();
//		test();
//		test1();
	}
	
	public static void test() {
		int cnt = 0;
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + " " + num2);
			cnt++;
			if (num1 + num2 == 5) {
				System.out.printf("총 던진횟수 %d", cnt);
				break;
			}
		}
	}
	
	
	public static void test1() {
		for(int i = 0; i < 4; i++) {
			for(int cnt = i; cnt < 4; cnt++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	

	
	public static void friendApp() {
		Scanner scn = new Scanner(System.in);
		
		String[] stringAry = new String[10];
		
		boolean dCheck = false;
		boolean run = true;
		
		while(run) {
			System.out.println("1. 추가, 2. 목록, 3. 삭제, 4. 종료");
			System.out.print("선택 >> ");
			
			int menu = scn.nextInt();
			
			if (menu > 0 && menu < 5) {
				switch(menu) {
				case 1:
					String add_name = inputName();
					if(!addCheck(add_name, stringAry)) {
						for(int i = 0; i < stringAry.length; i++) {
							if(stringAry[i] == null) stringAry[i] = add_name;
							System.out.println("추가완료");
							break;
						}
					}
					break;
			
				case 2:
					for(int i = 0; i < stringAry.length; i++) {
						if(stringAry[i] != null) System.out.println(stringAry[i]);
					}
					break;
					
				case 3:
					String del_name = inputName();
					
					for (int i = 0; i < stringAry.length; i++) {
						if(stringAry[i] != null && stringAry[i].equals(del_name)) {
							System.err.print("정말 삭제하시겠습니까? (삭제하려면 \"네\" 입력)>> ");
							String delConfrim = scn.nextLine();
							if (delConfrim.equals("네")) {
								stringAry[i] = null;
								System.err.println("삭제 완료");
								break;
							} else {
								System.out.println("삭제 취소");
							}
						} else {
							System.err.println("삭제하려는 대상을 찾을 수 없습니다.");
							break;
							
							
							//동일한 이름 있을 때 순서 지정하여 삭제 기능
						}
					}
					break;
				case 4:
					run = false;
				}
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		System.err.println("프로그램 종료");
	}
	
	public static String inputName() {
		
		Scanner inputAdd = new Scanner(System.in);
		
		System.out.print("이름입력 >> ");
		String name = inputAdd.nextLine();
	
		return name;
	
	}
	
	public static boolean addCheck(String add_name, String[] nameList) {
		
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i] != null && nameList[i].equals(add_name)) {
				System.out.print("중복되는 값이 있습니다. 그래도 추가하시겠습니까? >> ");
				String addConfrim = scn.nextLine();
				System.out.println(addConfrim);
				if (addConfrim.equals("네")) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return false;

	}
	
	
}
