package day0315;

import java.util.Scanner;

public class Ex11_Operater {
	public static void main(String[] args) {
		// 조건(삼항) 연산자
		// 조건식 ? 참 : 거짓
		// 두 수를 입력 후 더 큰 숫자를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
//		int su1, su2, max;
//		
//		System.out.println("두개의 숫자 입력");
//		su1 = sc.nextInt();
//		su2 = sc.nextInt();
//		
//		max = su1 > su2 ? su1 : su2;
//
//		System.out.println("max : "+ max);
		
		// 세 개의 수를 입력 후 더 큰 숫자를 출력하시오

		int su1, su2, su3, max;
		
		System.out.println("세 개의 숫자 입력");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		su3 = sc.nextInt();
		
		max = su1 > su2 && su1 > su3 ? su1 :
			  su2 > su2 && su2 > su3 ? su2 : su3;

		System.out.println("max : "+ max);
		
	}
}

