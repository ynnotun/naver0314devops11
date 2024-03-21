package day0321;

import java.util.Iterator;

public class Ex1_RandomJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1~30까지의 난수 10개를 발생하는데 중복처리하기
		 * */
		
		int []rand = new int[10];
		Loop:
		for(int i = 0; i<rand.length; i++) {
			int n = (int)(Math.random()*30)+1;
			rand[i] = n;
			
			for(int j = 0; j<i; j++) {
				if(rand[i]==rand[j]) {
					i--; // 다시 제자리로 가기 위해서 일단 1을 빼고 이동
					continue Loop; //i++로 이동
				}
			} 
		}
		
		// 순차적 정렬(오름차순)
		for(int i = 0; i<rand.length-1; i++) { // 기준
			for(int j = i+1; j<rand.length; j++) { // 기준
//				if(arr[i]<arr[j]) { // 내림차순 정렬
				if(rand[i]>rand[j]) { // 오름차순 정렬
					int temp = rand[i];
					rand[i] = rand[j];
					rand[j] = temp;
				}
			}
		}
		
		
		System.out.println("1~30사이의 중복되지 않은 난수 구하기");
		for(int i = 0; i<rand.length; i++) {
			System.out.printf("%4d", rand[i]);
		}

	}

}
