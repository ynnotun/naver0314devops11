package day0322;

class MyShop{
	
	private String product;
	private int su, dan;
	private static String message; // 공유되는 값
	public static final String SHOP="24시간 이마트";

	
	public String getProduct() {
		return this.product;
	}
	
	// setter method
	public void setProduct(String product) {
		this.product = product;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	static public void setMessage(String message) {
		// static 멤버변수는 같은 구역에 같은이름의 변수가 있을 경우 클래스명을 생략하지 말고 써준다
		MyShop.message = message;
	}
	
	// 상품, 수량, 단가를 한번에 변경하고 싶은 경우
	public void setData(String product, int su, int dan) {
		// 메서드 안에서 같은 멤버 메서드는 this로 호출 가능
		this.setProduct(product);
		this.setSu(su);
		this.setDan(dan);
	}
	// overloading method(중복함수) : 메서드명은 같으나 인자가 달라야한다
	// 인자의 개수나 순서가 다르면 중복함수가된다
	public void setData(String product, int su, int dan, String message) {
		this.setProduct(product);
		this.setSu(su);
		this.setDan(dan);
		
		// 인스턴스 메서드에서 static 메서드 호출이 가능한가? (O)
		setMessage(message); // 앞에 클래스명은 같은 클래스이기 생략
		// 반대로 static 메서드에서 인스턴스 멤버 메서드를 호출할 수 없음
		// static 메서드에서는 this가 없기 때문
		// static 메서드끼리는 호출가능
		
	}
	
	// getter가 아닌 일반 멤버 메서드로 출력 메서드를 만들 경우
	public void writeData() {
		System.out.println("상품명 : " + product);
		System.out.println("수량 : " + su);
		System.out.println("단가 : " + dan);
		System.out.println("총금액 : " + su*dan);
		System.out.println("오늘의 메시지: " + message);
		System.out.println("=".repeat(20));
	}

}

public class Ex3_StaticMethod {
	
	public static void main(String[] args) {
		MyShop sang1 = new MyShop();
		MyShop sang2 = new MyShop();
		MyShop sang3 = new MyShop();

		System.out.println("** 상품1 **");
		sang1.setProduct("딸기");
		sang1.setSu(3);
		sang1.setDan(2300);
		MyShop.setMessage("오늘 각종 과일 세일합니다!!");// static 메서드는 클래스명으로 호출
		
		sang1.writeData();
		
		System.out.println("** 상품2 **");
		sang2.setData("수박", 2, 30000);
		sang2.writeData();
		
		System.out.println("** 상품3 **");
		sang3.setData("참외", 5, 2000, "오늘 세일 마감!!!");
		sang3.writeData();
		
		System.out.println("** 상품1 다시 출력 **");
		sang1.writeData();
		
		
	}
}
