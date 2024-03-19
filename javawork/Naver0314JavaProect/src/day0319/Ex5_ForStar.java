package day0319;

import java.util.Scanner;

public class Ex5_ForStar {
	public static void main(String[] args) {

		/*
		 * 반복문으로 별을 출력하자
		 *
		 * */
		
		for(int i = 1; i<=5; i++) { // 행
			for(int j = 1; j<=5; j++) { // 열
				System.out.printf("%2s","★");
				if(j%5==0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("=".repeat(20));
		
		for(int i = 1; i<=5; i++) { // 행
			for(int j = 1; j<=i; j++) { // 열
				System.out.printf("%2s","★");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(20));
		
		for(int i = 1; i<=5; i++) { // 행
			for(int j = i; j<=5; j++) { // 열
				System.out.printf("%2s","★");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(20));
	}
}
