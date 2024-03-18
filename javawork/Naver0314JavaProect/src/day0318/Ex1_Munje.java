package day0318;

import java.util.Scanner;

public class Ex1_Munje {
	public static void main(String[] args) {
		/**
		 * 점수(score)를 입력 후 점수가 
		 * 90이상 "A"
		 * 80이상 "B"
		 * 70이상 "C"
		 * 60이상 "D"
		 * 나머지는  "F"를 출력
		 * (조건연산자를 이용하여 구하기)
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수?");
		
		int score = sc.nextInt();
		
		// if문을 사용하여 점수를 잘못 입력했을 경우 메서드를 종료하자
		
		if(score < 1 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			return; // main 메서드를 종료(곧 프로그램이 종료됨)
		}
		
		String grade = score >=90 ? "A" :
						score >=80 ? "B" :
						score >=70 ? "C" :
						score >=60 ? "D" : "F";
						
		System.out.printf("%d점은 %s학점 입니다.", score, grade);
	}
}
