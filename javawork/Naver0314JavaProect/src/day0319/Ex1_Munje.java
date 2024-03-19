package day0319;

public class Ex1_Munje {
	public static void main(String[] args) {
		/*
		 * 1-100사이의 소수를 모두 출력하고 몇 개인지 개수를 구하라
		 * 소수? 1을 제외하고 자기자신만을 약수로 가지고 있는 수
		 * 다중 for문을 이용할 것
		 * 
		 * */
		
		int count = 0;
		
		Exit:
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					continue Exit;
				}
			}
			count++;
			System.out.printf("%4d",i);
			if(count % 5 ==0) {
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("총 개수 : "+ count);
	}
}
