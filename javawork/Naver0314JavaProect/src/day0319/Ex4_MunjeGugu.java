package day0319;

import java.util.Scanner;

public class Ex4_MunjeGugu {
	public static void main(String[] args) {
		/*
		 * 
		 *
		 * */
		System.out.printf("%30s \n\n", "[구구단]");
		
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("**%d단**\t", dan);
		}
		System.out.println();
		System.out.println("=".repeat(63));
		
		for(int x = 1; x <= 9; x++) {			
			for(int y = 2; y <= 9; y++) {
				System.out.printf("%dx%d=%d \t", y, x, x*y);
			}
			System.out.println();
		}	
	}
}
