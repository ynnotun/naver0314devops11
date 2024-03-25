package day0325;

// 상속
class AA {
	AA() {
		System.out.println("AA의 디폴트 생성자");
	}
	
	AA(String msg) {
		System.out.println(msg+" 문자열을 받는 생성자(AA)");
	}
}

class BB extends AA {
	BB() {
		super(); // 생략 되어있음, 부모의 디폴트 생성자를 호출
		System.out.println("BB의 디폴트 생성자");
	}
	
	BB(String msg) { 
		super(msg); // 생략시에 super(); 호출 - AA의 디폴트 생성자
		// 생략할 수 없음, 디폴트인 경우에만 생략됨
		System.out.println(msg+" 문자열을 받는 생성자(BB)");
	}

}

public class Ex4_Inheri {
	public static void main(String[] args) {
		BB b = new BB(); // AA와 BB 내용 모두 호출
		System.out.println();
		BB b1 = new BB("Hello");
		
	}
}
