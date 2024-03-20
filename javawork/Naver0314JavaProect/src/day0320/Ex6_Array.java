package day0320;

import java.util.Iterator;

public class Ex6_Array {
	public static void main(String[] args) {

		// 배열을 선언하면서 초기값을 지정하는 경우
		
		int []arr1= {4,6,8,10,30};
		
		System.out.println("** 출력 #1 **");
		for(int i = 0; i<arr1.length; i++) {
			System.out.printf("%4d",arr1[i]);
		}
		
		System.out.println();
		System.out.println("** 출력 #2 **");
		for(int n:arr1) {
			System.out.printf("%4d",n);
		}
		
		System.out.println();
		System.out.println("** 선언후 한번에 값 할당 **");
		
		int []arr2;
		arr2 = new int[] {10,20,30,40};
		
		System.out.println("arr2의 개수 :" + arr2.length);

		for(int n:arr1) {
			System.out.printf("%4d",n);
		}
		
		System.out.println();
		System.out.println();		
		
		// 문자열 배열
		String []str1 = {"김영자", "이미자", "강호동", "이재성"};
		String []str2;
		str2 = new String[] {"사과", "오렌지", "딸기", "수박", "참외"};
		

		System.out.println("** 출력 #1 **");
		for(int i = 0; i<str1.length; i++) {
			System.out.printf("%4s",str1[i]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("** 출력 #2 **");
		for(String n:str2) {
			System.out.printf("%4s",n);
		}
		
	}
}
