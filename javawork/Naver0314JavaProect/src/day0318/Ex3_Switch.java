package day0318;

import java.util.Scanner;

public class Ex3_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.println("숫자 1-3을 눌러보세요");
		num = sc.nextInt();
		System.out.println(num+"을 눌렀어요!");
		
		switch (num) {
		case 1:
			System.out.println("One!!");
			break;
		case 2:
			System.out.println("Two!!");
			break;
		case 3:
			System.out.println("Three!!");
			break; // 잊지 않고 추가하도록 한다!
		default:
			System.out.println("Other Number!!");
		}
	}
}
