package day0322;


/*
 * 
 * 생성자(constructor)의 특징
 * 1. 클래스명과 동일한 메서드명으로 만들어야한다
 * 2. 리턴 타입이 없다
 * 3. overloading이 가능하다(여러개 생성 가능)
 * 4. 생성할때 단 한번 호출된다
 * 5. 멤버변수 초기화를 담당한다
 * 
 * 클래스가 public이면 생성자도 public이어야한다
 * 리턴타입을 입력하면 생성자로 인식하지 않음
 * 한 파일당 퍼블릭 클래스는 1개만 가능
 * */

class Kiwi{
	String name, addr;
	
	Kiwi(){
		System.out.println("디폴트 생생자");
		name="이미자";
		addr="서울";
	}
	
	Kiwi(String name){
		this.name=name;
		addr="서울";
	}
	
	Kiwi(String name, String addr){
		this.name=name;
		this.addr=addr;
	}
	
	public void show() {
		System.out.println(name + "님은 "+ addr+"에 살고 있어요");
	}
}

public class Ex8_Constructor {
	
	public static void main(String[] args) {
		Kiwi k1 = new Kiwi();
		Kiwi k2 = new Kiwi("오미자");
		Kiwi k3 = new Kiwi("영숙이", "부산");
		k1.show();
		k2.show();
		k3.show();
	}
}
