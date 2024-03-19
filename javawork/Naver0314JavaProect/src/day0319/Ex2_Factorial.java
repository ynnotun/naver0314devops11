package day0319;

import java.util.Scanner;

public class Ex2_Factorial {
	public static void main(String[] args) {

		/*
		 * 문제 2
		 * 단일 for문으로 풀이
		 * 
		 * 1! = 1
		 * 2! = 2
		 * 3! = 6
		 * 4! = 24
		 * 
		 * 10까지 출력
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		// 내가 푼 풀이
//		int result;
//		
//		for(int i = 1; i <= 10; i++) {
//			result = 1;
//			for(int j = 1; j <= i; j++) {
//				result *= j;
//			}
//			System.out.printf("%d! = %d \n", i, result);
//		}

		// 선생님 풀이
		int fact = 1;
		
		for(int i = 1; i<=10; i++) {
			fact *= i;
			System.out.println(i + "! = "+ fact);
		}
		

	}
}
