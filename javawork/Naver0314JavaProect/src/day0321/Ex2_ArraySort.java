package day0321;

public class Ex2_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		// 두값을 바꿀 경우
//		int a = 10, b = 20, temp;
//		System.out.printf("a=%d, b=%d \n",a,b);
//		
//		// 두값을 서로 바꾸기
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.printf("a=%d, b=%d \n",a,b);
		
		/* 선택정렬 - selection sort */		
		int []arr = {5,8,2,1,10};
		
		for(int i = 0; i<arr.length-1; i++) { // 기준
			for(int j = i+1; j<arr.length; j++) { // 기준
//				if(arr[i]<arr[j]) { // 내림차순 정렬
				if(arr[i]>arr[j]) { // 오름차순 정렬
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int a: arr) {
			System.out.print(a + "\t");
		}

	}

}
