package com.yedam.ref;

public class ArrayExe3 {
	
	static Student[] stdAry;
	
	
	public static void main(String[] args) {
		
		init();
		
		double avg = 0; // 평균을 도출해내기 위한 변수
		String outputFmt = "최고점수 : %d (%s)\n평균 : %.2f\n";
//		int max = 0; // 최고값을 도출해내기 위한 변수
//		String maxName = ""; // 최고값을 가진 학생의 이름을 가져오기 위한 변수
		Student maxStd = new Student();// 최고값을 가진 학생의 이름을 가져오기 위한 객체 변수
		Student maxHeight = new Student();
		
		for(int i = 0; i < stdAry.length; i++) {
			System.out.println(stdAry[i].stuName + " " + stdAry[i].score);
			avg += stdAry[i].score;
			if (maxStd.score < stdAry[i].score) {
				maxStd.score = stdAry[i].score;
				maxStd.stuName = stdAry[i].stuName;
			}
			if (maxHeight.height < stdAry[i].height) {
				maxHeight.height = stdAry[i].height;
				maxHeight.stuName = stdAry[i].stuName;
				maxHeight.gender = stdAry[i].gender;
			}
		}
		System.out.println();
		avg /= stdAry.length;
		
		System.out.printf(outputFmt, maxStd.score, maxStd.stuName, avg);
		System.out.printf("%s(%s)의 키가 %.1f로 제일 큽니다.", maxHeight.stuName, maxHeight.gender, maxHeight.height);
	}
	
	//객체 초기화 함수
	public static void init() {
		Student s1 = new Student();
		s1.stuName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
//		s1.gender = "남";
		
		Student s2 = new Student();
		s2.stuName = "김민규";
		s2.score = 85;
		s2.height = 165.7;
//		s2.gender = "여";
		
		Student s3 = new Student();
		s3.stuName = "박철민";
		s3.score = 90;
		s3.height = 180.3;
//		s3.gender = "남";
		
		// 이미 메소드 상단 클래스 부분에서 선언할 경우 이와 같이 배열에 값을 할당
		stdAry = new Student[] {s1, s2, s3}; 
	}
}
