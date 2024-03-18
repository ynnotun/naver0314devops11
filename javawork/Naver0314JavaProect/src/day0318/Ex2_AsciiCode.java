package day0318;

public class Ex2_AsciiCode {
	public static void main(String[] args) {

		// char : 내부적으로 int 타입으로 인식
		char a = 'A';
		char b = 65; // 아스키코드로 10진수 65는 문자 'A'이다
		
		System.out.println(a+ "," + b);
		System.out.printf("a=%d, %c \n", (int)a, a);
		System.out.printf("b=%d, %c \n", (int)b, b);
		
		// 묵시적 형변환 : char + int = int
		System.out.println(a+3); // 68
		System.out.println((char)(a+3)); // D
		
		char c = '7';
		System.out.println(c);// 문자 7 출력
		System.out.println(c+2);// 문자 7 + 2 = 55 + 2 = 57
		
		
		// 숫자 7로 변경 후 계산하고자 할 경우
		int n1 = c - '0'; // 55 - 48 = 7
		System.out.println(n1);// 숫자 7 출력
		System.out.println(n1+2);// 7 + 2 = 9
		
		
	}
}
