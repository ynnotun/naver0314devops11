package day0315;

import java.util.Scanner;

public class Ex8_Operater {
	public static void main(String[] args) {
		// 두개의 숫자를 입력 받은 후 산술연산하기(+,-,*,/,%)

		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자 입력");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		System.out.println("더하기 : "+(su1+su2));
		System.out.println("빼기 : "+(su1-su2));
		System.out.println("곱하기 : "+(su1*su2));
		System.out.println("나누기 : "+ ((double)su1/su2));
		System.out.println("나머지 : "+(su1%su2));
	}
}
