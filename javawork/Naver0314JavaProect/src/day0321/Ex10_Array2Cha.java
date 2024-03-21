package day0321;

import java.util.Scanner;

public class Ex10_Array2Cha {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 방법
		int [][]arr = new int[3][3]; // 3행 3열
		int binggo;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 같은 숫자가 나올 경우 binggo 변수를 1증가하여 빙고 개수를 구하고
		 * 같은 숫자가 없을 경우 꽝!! 이라고 출력
		 * */
		
		while(true) {
			binggo = 0;
			// 2차원 배열에 1~3의 값을 임의로 발생
			
			for(int i= 0; i<arr.length; i++) {
				for(int j= 0; j<arr.length; j++) {
					arr[i][j] = (int)(Math.random()*3)+1;
					
				}
			}
			
			// 출력
			for(int i= 0; i<arr.length; i++) {
				for(int j= 0; j<arr.length; j++) {
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println("\n");
			}
			
			// 빙고 개수나 꽝 출력
			
			int []num = new int[3];
			
			for(int i= 0; i<arr.length; i++) {
				if(arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
					binggo++;
				}
				if(arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]) {
					binggo++;
				}
			}
			
			if(arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) {
				binggo++;
			}
			
			if(arr[0][0] == arr[1][1] && arr[0][0] == arr[2][0]) {
				binggo++;
			}
			
			if(binggo == 0) System.out.println("꽝");
			else System.out.println("빙고"+binggo+"개");
			
			
			System.out.println("=".repeat(12));
			String ans = sc.nextLine();
			
			if(ans.equalsIgnoreCase("x")) {
				System.out.println("** 빙고게임을 종료합니다 **");
				break;
			}
				
		}
		
		
	}

}
