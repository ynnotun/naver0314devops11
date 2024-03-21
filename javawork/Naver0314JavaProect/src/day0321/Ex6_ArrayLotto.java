package day0321;

import java.util.Scanner;

public class Ex6_ArrayLotto {

	public static void main(String[] args) {
		
		/*
		 * money를 입력하면 해당 횟수만큼 로또 구하기
		 * 로또 : 1~45까지의 중복되지 않은 숫자
		 * 로또 금액 입력? 800
		 * 		금액이 부족합니다
		 * 
		 * 로또 금액 입력? 0
		 * 		종료합니다(while문 종료)
		 * 
		 * 로또 금액 입력? 3000
		 * 		
		 * 		1회 : 	4	7	12	34	45
		 * 		2회 : 	4	7	12	34	45
		 * 		3회 : 	4	7	12	34	45
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int []lotto = new int[6];
		int money;
		
		while(true) {
			System.out.println("금액을 입력하세요");
			money = Integer.parseInt(sc.nextLine());
			
			if(money == 0) {
				System.out.println("종료합니다");
				break;
			} else if(money < 1000) {
				System.out.println("금액이 부족합니다");
				continue;	
			} else {
				System.out.println(money / 1000+"회 분량의 로또를 구매합니다");
				for(int x = 1; x <= money / 1000; x++) {
					
					// 난수 입력
					Loop:
						for(int i = 0; i<lotto.length; i++) {
							int n = (int)(Math.random()*45)+1;
							lotto[i] = n;
							
							for(int j = 0; j<i; j++) {
								if(lotto[i]==lotto[j]) {
									i--; // 다시 제자리로 가기 위해서 일단 1을 빼고 이동
									continue Loop; //i++로 이동
									// 두번째 for문 아래에 다른 코드가 없으므로 break 써도 됨
								}
							} 
						}
					
					// 정렬
					for(int i = 0; i<lotto.length-1; i++) {
						for(int j = i+1; j<lotto.length; j++) {
							if(lotto[i]>lotto[j]) {
								int temp = lotto[i];
								lotto[i] = lotto[j];
								lotto[j] = temp;
							}
						}
					}
					
					// 정렬된 숫자 출력
					System.out.print(x + "회 :");
					for(int i = 0; i<lotto.length; i++) {
						System.out.printf("%4d", lotto[i]);
					}
					System.out.println();
				}
				System.out.println("\n완료되었습니다.");
				break;
			}
		}

		
	}

}
