package day0320;

import java.util.Random;
import java.util.Scanner;

public class Ex4_RandomGame {
	public static void main(String[] args) {
		
		/*
		 * 연도와 월을 입력하면 해당 달력을 출력하시오
		 * 
		 * 만년 달력을 만들기 위해서 알아야 할 사항 2가지
		 * 1. 내가 입력한 연도-월의 1일이 무슨 요일인가?
		 * 2. 내가 입력한 연도-월의 
		 *
		 * */
		
		Scanner sc = new Scanner(System.in);
		int year, month, week, endday;
		
		System.out.println("달력을 조회할 연도와 월을 입력하세요");
		year = sc.nextInt();
		month = sc.nextInt();
		
		//1~12월이 아닐 경우 종료
		
		if(month <1 || month> 12) {
			System.out.println("잘못된 숫자입니다.");
			return;
		}
		
		System.out.printf("%10d년 %d월 달력 \n\n", year, month);
		System.out.println("=".repeat(50));
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=".repeat(50));
		
		
		
				
				
	
	}
}
