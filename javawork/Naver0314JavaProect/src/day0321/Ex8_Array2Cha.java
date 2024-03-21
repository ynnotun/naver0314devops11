package day0321;

import java.util.Scanner;

public class Ex8_Array2Cha {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 방법
		int [][]arr;
		arr = new int[2][3]; // 2행 3열
		
		System.out.println("행 개수 : " + arr.length);
		System.out.println("0번행의 열개수 : " + arr[0].length);
		
		arr[0][0] = 3;
		arr[0][2] = 10;
		
		arr[1][1] = 30;
		arr[1][2] = 50;
		
		System.out.println("2차원 배열 출력");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
