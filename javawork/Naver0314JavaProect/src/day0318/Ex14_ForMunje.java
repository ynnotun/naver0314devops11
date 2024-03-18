package day0318;

import java.util.Scanner;

public class Ex14_ForMunje {
	public static void main(String[] args) {

		/*
		 * 5개의 점수(score)를 입력하면 개수(count)와 합계(sum) 출력하기
		 * (단, 1~100이 아닐 경우는 개수에서 제외하고 합계에서도 제외하기 - continue 사용)
		 * 
		 * 예)
		 * 점수는? 80
		 * 점수는? 120
		 * 점수는? 70
		 * 점수는? 60
		 * 점수는? 100
		 * 
		 * 입력한 점수 개수 : 4
		 * 총 합계 : 310
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		int score, sum = 0;
		int count = 0; 
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("점수는?");
			score = sc.nextInt();
			
			if(score <0 || score>100) {
				continue;
			} else { 
				count++;
				sum += score;	
			}			
		}
		System.out.println("입력한 점수 개수 : " + count);
		System.out.println("총 합계 : " + sum);
		

	}
}
