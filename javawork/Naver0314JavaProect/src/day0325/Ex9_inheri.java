package day0325;

class Animal {
	
	public void writeAnimal() {
		System.out.println("Animal 부모클래스!!!");
	}
}

class Cat extends Animal {
	@Override
	public void writeAnimal() {
		super.writeAnimal();
		System.out.println("나는 야옹!! 고양이입니다");
	}
	
	 public void play() {
		System.out.println("야옹야옹!!");
	}
}
class Dog extends Animal {
	@Override
	public void writeAnimal() {
		super.writeAnimal();
		System.out.println("나는 멍멍!! 강아지입니다");
	}
	
	public void play() {
		System.out.println("멍멍멍!!");
	}
}

public class Ex9_inheri {
	public static void main(String[] args) {
		
		// 기존 방법
		Cat cat1 = new Cat();
		cat1.writeAnimal();
		cat1.play();
		
		Dog dog1 = new Dog();
		dog1.writeAnimal();
		dog1.play();
		
		// 하나의 명령으로 각각의 메소드를 호출하는 방법(다형성)
		System.out.println("=============");
		
		// 다형성 : 부모클래스로 선언, 자식클래스로 생성
		// 오버라이드 메서드에 한해서만 호출이 가능하다
		// writeAnimal은 호출이 가능하지만, play 메서드는 호출할 수 없다
		
		Animal ani = null;
		ani = new Cat();
		ani.writeAnimal();
//		ani.play(); // 에러 발생
		
		ani = new Dog();
		ani.writeAnimal();
		
	}
}
