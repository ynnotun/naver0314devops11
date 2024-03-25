package day0325;

abstract class Animal2 {
	// 메소드 선언
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 선언
	
	public abstract void sound();
}

class Dog2 extends Animal2 {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat2 extends Animal2 {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class Ex11_Book328 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.sound();
		
		Cat2 cat = new Cat2();
		cat.sound();
		
		// 매개변수의 다형성
		animalSound(new Dog2());
		animalSound(new Cat2());
		
	}
	
	public static void animalSound(Animal2 animal) {
		animal.sound();
	}
}
