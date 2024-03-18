package day0318;

import java.util.Scanner;

public class Ex12_Gugudan {
	public static void main(String[] args) {
		
		/*
		 * 구구단? 11
		 * 잘못된 숫자입니다. : if 문
		 * 
		 * 
		 * 구구단? 5
		 * 		** 5단 **
		 * 		5 x 1 = 5 : 단일 for문
		 * 		5 x 2 = 10
		 * 		.
		 * 		.
		 * 		5 x 9 = 45
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단?");
		
		int num = sc.nextInt();
		
		if(num <1 || num >9) {
			System.out.println("잘못된 숫자입니다.");
		} else {
			System.out.printf("** %d단 ** \n", num);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d \n", num, i, num*i);
			}

		}

	}
}
