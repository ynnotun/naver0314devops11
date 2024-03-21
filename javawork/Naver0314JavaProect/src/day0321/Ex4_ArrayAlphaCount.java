package day0321;

import java.util.Scanner;

public class Ex4_ArrayAlphaCount {

	public static void main(String[] args) {

		/*
		 * 영어문장을 입력하면 알파벳 기준으로 각각의 갯수를 출력하시오
		 * Have a Nice Day!!
		 * 
		 * 
		 * A : 3	B : 0	... 	Z:0
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 문장을 입력하세요");
		String msg = sc.nextLine();
		
		int []alpha = new int[26];
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.toLowerCase().charAt(i);
			if(ch>='a' && ch <='z') {
				alpha[ch - 'a']++;	
			}
		}
		
		System.out.println("** 알파벳별 개수 구하기 **");
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.print((char)(i+'a') + " : " + alpha[i]+"\t");
			if((i+1)%5==0) System.out.println();
		}
		

	}

}
