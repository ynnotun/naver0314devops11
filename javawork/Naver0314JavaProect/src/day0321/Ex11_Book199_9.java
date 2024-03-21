package day0321;

import java.util.Scanner;

public class Ex11_Book199_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int student = Integer.parseInt(sc.nextLine());
		
		System.out.println("학생점수를 입력하세요");
		int []arr = new int[student];
		
		for(int i = 0; i<student; i++) {
			System.out.println(i+1+"번째 학생점수를 입력하세요");
			int score = Integer.parseInt(sc.nextLine());
			arr[i] = score;
		}
		
		System.out.println("-".repeat(50));
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-".repeat(50));
		
		while(true) {
			int answer = Integer.parseInt(sc.nextLine());
			System.out.println("선택>"+answer);
			if(answer == 1) {
				System.out.println("학생수>"+student);
				continue;
			} else if (answer == 2) {
				System.out.println("점수입력>"+student);
				continue;
			} else if (answer == 3) {
				System.out.println("점수리스트>");
				for(int i = 0; i<student; i++) {
					System.out.println(i+1+"번째 학생점수 : "+ arr[i]);
				}
				continue;
			} else if (answer == 4) {
				int highScore = 0;
				for(int i = 0; i<arr.length; i++) { 
					for(int j = 1; j<arr.length; j++) {
						if(arr[i]<arr[j]) {
							highScore = arr[j];
						}
					}
				}
				System.out.println("최고점수>"+ highScore);
				
				int sum = 0;
				for(int i = 0; i<arr.length-1; i++) { 
					sum += arr[i];
				}
				System.out.println("평균점수>"+sum/student);
				continue;
			} else if (answer == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
