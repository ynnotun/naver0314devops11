package day0325;

class Parent2 {
	public void job() {
		System.out.println("부모클래스에서 해야할 일 처리...");
		
	}
}

class Sub2 extends Parent2 {
	@Override // 어노테이션 - 없어도 에러는 발생하지 않으나, 오버라이드임을 명시해주어 없는 메서드를 입력시 에러 발생
	public void job() {
		super.job();// 같은 이름의 메서드가 현재 클래스에 존재하므로 부모가 가진 메서드 호출 시 반드시 super로 호출한다
		System.out.println("자식클래스에서 처리해야할 일.."); // 코드 순서에 따라 순서를 다르게 작성할 수 있다
	}
}

public class Ex6_Override {
	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.job(); // sub2가 가진 job method가 호출
	}
}
