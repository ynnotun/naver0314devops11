package day0319;


public class Ex3_Munje {
	public static void main(String[] args) {
		/*
		 * xy+yx=121이 나오는 x, y 모두 구하기
		 * x y는 1-9사이의 한 자리 숫자임
		 * 
		 * (예) x = 2, y = 9
		 * */
		
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				int susik = (x*10 + y) + (y*10 + x);
				if(susik == 121) {
					System.out.printf("%d%d + %d%d = 121\n", x, y, y ,x);
				}
			}
		}

	}
}
