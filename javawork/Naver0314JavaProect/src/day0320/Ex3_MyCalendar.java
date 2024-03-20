package day0320;

import java.util.Random;
import java.util.Scanner;

public class Ex3_MyCalendar {
	public static void main(String[] args) {
		
		/*
		 * 1. 1~100사이의 난수를 발생한 후 숫자 맞히기
		 * 2. 숫자 입력 시 앞에 횟수 출력
		 * 3. 숫자 n이 난수보다 크면 (n보다 작습니다)
		 * 4. 숫자를 맞혔을 경우(횟수와 정답 출력)
		 * 5. 계속 숫자 맞히기 게임을 하시겠습니까?(y/n)
		 * 6. y를 누르면 다시 난수 발생 후 숫자 맞히기 시작
		 * 7. y가 아니면 게임 종료
		 *
		 * */
	
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int count=0, num;
		
		System.out.println("1~100까지의 숫자를 입력하시오.");
//		
//		Exit:
//		while(true) {
//			num = r.nextInt(100)+1;
//			System.out.println(num);
//			int input = Integer.parseInt(sc.nextLine());
//			if(num == input) {
//				System.out.println("정답은 "+ num +"입니다.");
//				System.out.println("시도한 횟수: "+count);
//				System.out.printf("\n\n 게임을 계속 진행하시겠습니까? (y/n)");
//				while(true) {
//					String answer = sc.nextLine();
//					
//					if(answer.equalsIgnoreCase("y")) {
//						break;
//					} else {	
//						break Exit;
//					}
//				}
//			} else if(num < input) {
//				count++;
//				System.out.println(count+ "회: "+ input + "이 더 큽니다");
//				continue;
//			} else if(num > input) {
//				count++;
//				System.out.println(count+ "회: "+ input + "이 더 작습니다");
//				continue;
//			}	
//		}
//		
//		System.out.println("** 게임을 종료합니다. **");
		
		
		Exit:
		while(true) {
			num = r.nextInt(100)+1;
			System.out.println(num);
			while(true) {
				int input = Integer.parseInt(sc.nextLine());
				if(num == input) {
					System.out.println("정답은 "+ num +"입니다.");
					System.out.println("시도한 횟수: "+count);
					System.out.printf("\n\n게임을 계속 진행하시겠습니까? (y/n)");
					String answer = sc.nextLine();
					
					if(answer.equalsIgnoreCase("y")) break;
					else break Exit;
				} else if(num < input) {
					count++;
					System.out.println(count+ "회: "+ input + "이 더 큽니다");
					continue;
				} else if(num > input) {
					count++;
					System.out.println(count+ "회: "+ input + "이 더 작습니다");
					continue;
				}
			}
		}
		
		System.out.println("** 게임을 종료합니다. **");
	}
}
