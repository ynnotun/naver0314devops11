package day0322;

public class Ex5_CallBy {
	
	public static void changeNum(int n) {
		n = 10;
	}
	
	public static void changeArray(int []a) {
		a[1] = 200;
	}
	
	public static void changeHome(String home) {
		home = "제주도";
	}
	
	public static void main(String[] args) {
		int n = 50;
		changeNum(n); // 값만 전달, Call By Value(기본형은 모두 해당)
		System.out.println("n="+n);
		int []arr = {3,5,7}; // 배열은 객체로 인식
		changeArray(arr); // 주소가 전달, Call By Reference
		
		for(int a : arr) {
			System.out.printf("%4d",a);
		}
		
		System.out.println();
		
		String home = "서울";
		changeHome(home); // Call by value : 주소가 아닌 값이 전달
		System.out.println(home); // 여전히 "서울"이라고 출력
	}

}