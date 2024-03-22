package day0322;

class Apple{
	String msg = "Happy Day!!"; // 인스턴스 멤버변수
	static String message = "오늘은 금요일"; // static 멤버변수(클래스 멤버변수)
}

class Banana{
	static int kor = 100;
	static int eng = 100;
	String name = "마이클";
}

public class Ex1_Object {
	
	// 멤버 변수들
	String name = "홍길동"; // 인스턴수 변수
	final static int MAX = 100; // static 변수
	// final : 상수 지정, 값 변경이 안됨
	
	public static void main(String[] args) {

		/*
		 * static 멤버 메서드는 
		 * static 멤버 변수나 static 멤버 메서드만 접근 가능
		 * 일반 인스턴스 메서드나 변수를 접근하기 위해서는 new로 생성 후
		 * 그 변수를 이용하여 호출해야만 한다
		 * */
		
//		System.out.println(name); // 오류 발생
		System.out.println(Ex1_Object.MAX); // static 변수는 클래스명.변수명
		System.out.println(MAX); // 같은 클래스일 경우는 앞에 클래스명 생략가능
		
		// name을 출력하려면 new 생성한 인스턴스 변수가 필요하다
		Ex1_Object ex = new Ex1_Object();
		// ex가 인스턴스 변수이다. 이 변수를 이용해야만 name이 접근이 가능하다
		System.out.println(ex.name);
		
		// Apple이 가진 2개의 멤버변수를 출력
		Apple apple = new Apple();
		System.out.println(apple.msg);
		System.out.println(Apple.message);
		
		// Banana클래스의 kor, eng점수 및 합계 출력
		System.out.println("국어점수 : " + Banana.kor);
		System.out.println("영어점수 : " + Banana.eng);
		System.out.println("합계 : " + Banana.kor + Banana.eng);
		
		// Banana클래스의 name 출력
		Banana banana = new Banana();
		System.out.println("이름 : "+banana.name);
		
	}
}
