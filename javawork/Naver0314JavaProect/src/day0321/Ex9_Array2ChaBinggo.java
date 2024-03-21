package day0321;

import java.util.Scanner;

public class Ex9_Array2ChaBinggo {
	public static void main(String[] args) {
		
		// 자바는 각 행의 열 개수를 각각 다르게 줄 수 있다
		// c언어의 경우 가장 큰 열개수에 맞춰서 초기화된다
		
		int [][]arr = new int[][] {
			{3,4,5},
			{10,20,30,40},
			{1,5,7,9,11},
		};
		
		System.out.println("행의 개수 :"+ arr.length);
		System.out.println("0행의 열의 개수 :"+ arr[0].length);
		System.out.println("1행의 열의 개수 :"+ arr[1].length);
		System.out.println("2행의 열의 개수 :"+ arr[2].length);

		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
