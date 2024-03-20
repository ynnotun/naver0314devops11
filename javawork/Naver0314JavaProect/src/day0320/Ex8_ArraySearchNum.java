package day0320;

import java.util.Iterator;
import java.util.Scanner;

public class Ex8_ArraySearchNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []data = {12, 3, 6, 1, 7, 10, 8, 5, 16, 19};
		int searchIndex;
		int num;
		
		while(true) {
			searchIndex = -1;
			System.out.println("검색할 숫자를 입력하세요");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			for(int i = 0; i < data.length; i++) {
				if(num == data[i]) {
					searchIndex = i;
					break;
				}
			}
			
			if(searchIndex == -1) {
				System.out.println("\t"+num+"은 데이터에 없습니다");
			}else {
				System.out.println("");
			}
		}
	}
}
