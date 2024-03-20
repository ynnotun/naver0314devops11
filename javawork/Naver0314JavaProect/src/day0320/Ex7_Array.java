package day0320;

import java.util.Iterator;

public class Ex7_Array {
	public static void main(String[] args) {

		
		int []data= {7,10,30,-13,67,-123,78,345,3,110};
		
		int max, min;
		max = min = data[0]; // 무조건 첫 데이터를 max 또는 min 지정
		System.out.println(data.length);

		for(int i = 1; i< data.length;i++) {
			if(max<data[i]) max=data[i];
			if(min>data[i]) min=data[i];
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
		int plusCount=0, minusCount=0;
		// 배열 데이터 중 양수의 개수와 음수의 개수를 구하여 출력해 보세요
		
		for(int i = 1; i< data.length;i++) {
			if(0<data[i]) plusCount++;
			if(0>data[i]) minusCount++;
		}
		System.out.println("양수 :" + plusCount);
		System.out.println("음수 :" + minusCount);
	
	
	}
}
