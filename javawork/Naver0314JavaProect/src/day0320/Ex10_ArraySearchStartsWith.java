package day0320;

import java.util.Scanner;

public class Ex10_ArraySearchStartsWith {
	public static void main(String[] args) {
		
		String []members = {"강호동", "한가인", "유재석", "이승민", "강하나", "손미나", "이영자", "박남정", "한지혜", "손창민"};

		/*
		 * 검색할 이름(searchName)? 강
		 * 		1번째 : 강호동
		 * 		5번째 : 강하나
		 * 		총 2명 검색
		 *
		 * 검색할 이름(searchName)? 박이
		 * 		"박이"로 시작하는 멤버는 없습니다
		 * 
		 * (반복해서 검색을 하다가 'q'나 'Q'를 입력 시 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		int searchIndex;
		int searchCount;
		String name;
		
		while(true) {
			searchIndex = -1;
			searchCount = 0;
			System.out.println("검색할 이름 입력하세요");
			name = sc.nextLine();
			if(name.equalsIgnoreCase("q")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			for(int i = 0; i < members.length; i++) {
				if(members[i].startsWith(name)) {
					searchIndex = i;
					System.out.println((searchIndex+1)+"번째 :"+members[i]);
					searchCount++;
				}
			}
			if(searchCount>0) {
				System.out.println("총 "+searchCount+"명 검색");
			}else {
				System.out.println("\""+name+"\"으로 시작하는 멤버는 없습니다");
			}
			
		}
	}
}
