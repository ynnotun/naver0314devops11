package day0319;

import java.util.Scanner;


public class Ex11_StringMunje {
	public static void main(String[] args) {
		/*
		 * String 타입의 문자열(msg)를 입력받아
		 * 그 문자열 안에 대문자, 소문자, 숫자가 몇개 포함되어있는지 출력하시오
		 * 
		 * 예) Happy Day 123!!
		 * 대문자 : 2개 
		 * 소문자 : 6개
		 * 숫자 : 3개
		 * 
		 * String의 charAt과 length를 사용하면 됨
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String msg = sc.nextLine();
		int lowerCase = 0, upperCase = 0, number = 0;
		
		System.out.println();
		
//		내가 작성한 코드		
//		for(int i = 0; i < msg.length(); i++) {			
//			for (int j = 'a'; j <= 'z'; j++) {
//				if(msg.charAt(i) == (char)j) {
//					lowerCase++;
//				}
//			}
//			for (int j = 'A'; j <= 'Z'; j++) {
//				if(msg.charAt(i) == (char)j) {
//					upperCase++;
//				}
//			}
//			for (int j = '0'; j <= '9'; j++) {
//				if(msg.charAt(i) == (char)j) {
//					number++;
//				}
//			}
//		}

		// 선생님 코드
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if(ch>='a' && ch<='z')
				lowerCase++;
			else if(ch>='A' && ch<='Z')
				upperCase++;
			else if(ch>='0' && ch<='9')
				number++;
		}

		System.out.println("소문자 : "+ lowerCase);
		System.out.println("대문자 : "+ upperCase);
		System.out.println("숫자 : "+ number);
		
		
	}
	
}
