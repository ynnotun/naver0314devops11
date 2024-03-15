package day0315;

public class Ex2_DataType {
	public static void main(String[] args) {
		
		// 문자열을 지정하는 방법
		String str1 = new String("happy"); // 방법1
		String str2 = "happy"; // 방법2
		
		System.out.println(str1);
		System.out.println(str2);
		
	    // 긴 문자열을 지정하는 경우
		String str3 = "나는 오늘도 자바를 공부한다.. 오늘은 즐거운 금요일인데 할일이 없다.. 어쩌고 저쩌고....";
		String str4 = "나는 오늘도 자바를 공부한다.. \n" + "오늘은 즐거운 금요일인데 할일이 없다.. \n" +"어쩌고 저쩌고....";
		
		
		System.out.println(str3); 
		System.out.println(); // 한 줄 띄움
		System.out.println(str4);
		
		// 텍스트블록 - JDK 15부터 가능 
		String str5 = """
				나는 오늘도 자바를 공부한다.. 
				오늘은 즐거운 금요일인데 할일이 없다.. 
				어쩌고 저쩌고....""";

		System.out.println();
		System.out.println(str5);

		// 정수 타입
				byte a= 127;
				System.out.println(a);
				
				byte b = (byte) 200; // (byte):cast연산자:강제로 형변환, 값손실발생
				System.out.println(b); // -56 
				// 값손실이 발생할 경우 엉뚱한 값이 출력(내부적으로는 2의 보수값이다.)
				
				// 실수 타입
				float f1 = 123.567891234f;
				
				// f를 붙여야 4바이트 float으로 저장
				double f2 = 123.567891234;
				
				System.out.println(f1); // 정밀도가 보통 8자리까지 정확히 나온다
				System.out.println(f2); // 정밀도가 보통 15자리까지 정확히 나온다
				
				// 1글자 지정은 char, 문자열은 String(객체타입)
				char ch1 = 'A';
				char ch2 = '가';
				
				System.out.println(ch1); // 
				System.out.println(ch2); // 
	}
}
