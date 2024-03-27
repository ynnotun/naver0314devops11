package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
//		Set<String> set1 = new TreeSet<String>(); // 가나다순 정렬
		Set<String> set1 = new HashSet<String>();
		set1.add("이청아");
		set1.add("유지태");
		set1.add("이미자");
		set1.add("한가인");
		set1.add("강호동");
		set1.add("이청아");
		
		System.out.println("set1의 데이터 개수 : "+set1.size()); // 3개, 중복데이터는 1번만 포함(덮어씌워짐)
		System.out.println("** 출력1 **");
		for(String n : set1) {
			System.out.println(n);
		}
		
		System.out.println("** 출력2 **");
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
