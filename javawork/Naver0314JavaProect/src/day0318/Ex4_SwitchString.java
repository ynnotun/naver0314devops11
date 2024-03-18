package day0318;

import java.util.Scanner;

public class Ex4_SwitchString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String color;
		System.out.println("영문으로 색상 입력하기");
		color = sc.nextLine();
		
		// switch에서 JDK 8부터 문자열도 가능
		
		switch (color) {
		// break가 없으면 그 다음 case가 실행
		case "RED": // 같은 로직을 수행하는 경우 break문을 사용하지 않음
		case "Red": // 수평으로 나열해도 상관 없음
		case "red":
			System.out.println("빨강색");
			break;
		case "GREEN":
		case "green":
			System.out.println("초록색");
			break;
		case "PINK":
		case "pink":
			System.out.println("분홍색");
			break;
		default:
			System.out.println("빨강, 초록, 분홍 이외의 색");
		}
	}
}
