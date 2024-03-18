package day0318;

import java.util.Iterator;
import java.util.Scanner;

public class Ex9_For {
	public static void main(String[] args) {
		
		// 오름차순
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		// 내림차순
		for (int i = 10; i >= 1; i--) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		// 3씩 증가
		for (int i = 1; i <= 10; i+=3) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		// 문자 활용 - 대문자 출력
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c",(char)i);
		}
		System.out.println();
		
		// 문자 활용 - 소문자 출력
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%c",(char)i);
		}
		System.out.println();
		
		// break 활용
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%3d",i);
			if(i == 5) {
				break; // 현재 속한 반복문을 빠져나간다
			}
		}
		System.out.println();
		
		// continue 활용
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue; // 짝수일 경우는 출력하지 말고 i++
			}
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		
	}
}
