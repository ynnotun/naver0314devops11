package day0326;

interface Tire {
	// 추상 메서드
	void roll();
}

class HankookTire implements Tire {
	// 추상 메서드 재정의
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire {
	// 추상 메서드 재정의
		@Override
		public void roll() {
			System.out.println("금호 타이어가 굴러갑니다.");
		}
}


class Car {
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	// 메서드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}

public class Ex8_Book376 {
	public static void main(String[] args) {
		// 자동 객체 생성
		Car myCar = new Car();
		
		// run() 메서드 실행
		myCar.run();
		
		// 타이어 객체 교체
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		// run() 메서드 실행(다형성 : 실행 결과가 다름)
		myCar.run();
	}	
}
