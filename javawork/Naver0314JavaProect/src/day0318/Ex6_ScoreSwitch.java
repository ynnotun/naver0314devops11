package day0318;

import java.util.Scanner;

public class Ex6_ScoreSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수?");
		
		char grade;
		int score = sc.nextInt();
		
		if(score < 1 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			return; // main 메서드를 종료(곧 프로그램이 종료됨)
		}

		
		// 1. switch
//		switch (score/10) {
//		case 10:
//		case 9:
//			grade = 'A'; break;
//		case 8:
//			grade = 'B'; break;
//		case 7:
//			grade = 'C'; break;
//		case 6:
//			grade = 'D'; break;
//		default:
//			grade = 'F';
//		}
		
		
		// if문
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if(score >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.printf("%d점은 %s학점 입니다.", score, grade);
	}
}
