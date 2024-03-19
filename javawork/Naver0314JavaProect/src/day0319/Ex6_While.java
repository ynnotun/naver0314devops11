package day0319;

import java.util.Scanner;

public class Ex6_While {
	public static void main(String[] args) {

		int n = 10;
		// 선조건 : 조건이 맞지 않으면 바로 반복문을 빠져나간다
		while(n>10) {
			System.out.println("Hello #1");
		}
		
		// 후조건: 일단 로직을 처리한 후 조건을 비교하여 빠져나간다
		
		do {
			System.out.println("Hello #2");
		} while(n>10);
		
		int a = 1;
		
		while(a<=10) {
			System.out.printf("%3d", a++);
		}
		System.out.println();
		a=1;
		
		while(true) {
			System.out.printf("%3d", a++);
			if(a>10) break;
		}
		
		System.out.println();
		
		char ch = 'A';
		while(ch <= 'Z') {
			System.out.printf("%c", (char)ch++);
		}
		
	}
}
