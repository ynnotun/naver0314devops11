package day0315;

public class Ex10_Operater {
	public static void main(String[] args) {
		// 증감연산자
		// 전치일 경우 1순위, 후치일 경우는 끝순위
		// 단 단항일 경우는 상관없음
		int m=5, n=5;
		
		m++;
		++n;
		System.out.println("m : "+m);
		System.out.println("n : "+n);
		
		int a=10, b=10;
		
		a+=m++; // 후치는 제일 마지막에 계산한다
		System.out.println("a : "+a);
		System.out.println("m : "+m);
		
		
		b+=++n; // 먼저 증가 후 a에 더해진다
		System.out.println("b : "+b);
		System.out.println("n : "+n);
		
		m=5;
		System.out.println(m++);//먼저 출력 후 증가
		
		n=5;
		System.out.println(++n);//먼저 증가 후 출력
		
		System.out.println("m : "+m);
		System.out.println("n : "+n);
	}
}

