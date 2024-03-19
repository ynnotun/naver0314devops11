package day0319;

import java.util.Scanner;

public class Ex7_While {
	public static void main(String[] args) {
		/*
		 * while문을 이용하여 score 점수를 입력 받은 후
		 * 0을 입력하면 while문을 빠져나가서 총 개수와 합계르 구하시오
		 * (단, 1~100이 아닌 값은 개수와 합계에서 제외)
		 * */
		

		Scanner sc = new Scanner(System.in);
		
		int score, sum = 0, count = 0; 

		System.out.println("점수는?");
		
		while(true) {
			score = sc.nextInt();
			if(score == 0) break;
			if(score <0 || score>100) {
				continue;
			} else {
				count++;
				sum += score;
			}
		};
		
		System.out.println("입력한 점수 개수 : " + count);
		System.out.println("총 합계 : " + sum);
		
		
	}
}
