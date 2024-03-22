package day0322;

class Oper{
	static public int sum(int a, int b) {
		return a+b;
	}
	
	static public double sum(double a, double b) {
		return a+b;
	}
	
	static public String sum(String a, String b) {
		return a+b;
	}
	
	// variable Arguments JDK에서 추가된 기능
	static public int hap(int ...n) { // 개수 제한 없이 인자로 받을 수 있음
		System.out.println("전달받은 숫자의 개수: "+ n.length);
		int s= 0;
		for(int i = 0; i<n.length; i++) {
			System.out.printf("%4d", n[i]);
			s += n[i];
		}
		System.out.println();
		return s;
	}
	
	static public void writeColor(String ...color) {
		System.out.println("전달받은 색상의 개수: "+ color.length);
		for(int i = 0; i<color.length; i++) {
			System.out.println(i+ " : "+ color[i]);
		}
		System.out.println();
	}

}

public class Ex4_Overloading {
	
	public static void main(String[] args) {
		System.out.println(Oper.sum(5, 100));
		System.out.println(Oper.sum(1.2, 5.6));
		System.out.println(Oper.sum("apple", "banana"));
		System.out.println(Oper.hap(3,6,8));
		System.out.println(Oper.hap(3,6,8,1,2,3,5,6,7,2,3,4,65,76,2,3,4));
		Oper.writeColor("pink", "yellow", "red", "blue");
		
	}
}
