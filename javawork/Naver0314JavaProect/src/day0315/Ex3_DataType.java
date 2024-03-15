package day0315;

public class Ex3_DataType {
	public static void main(String[] args) {
		int year = 2024;
		int month = 3;
		int day = 5;
		
		String msg = "Have a Nice Day!!";
		char blood = 'B';
		double avg = 97.4567;
		
		System.out.println("** 출력 1 **");
		System.out.println("날짜:" + year + "-" + month + day);
		System.out.print("혈액형:" + blood + "형"); //  print는 개행을 안함
		System.out.print("\t평균:" + avg);
		System.out.println("=================");
		// printf를 이용한 출력 (JDK5부터)
		// 변환기호를 이용하여 출력
		// 정수 : %d, 실수: %f, 문자: %c, 문자열: %s
		System.out.printf("**%40s**\n\n", msg); // 40칸의 우측기준으로 출력
		System.out.printf("**%-40s**\n\n", msg); // 40칸의 좌측기준으로 출력
		System.out.printf("**%s**\n\n", msg);
		System.out.printf("날짜 : %d-%d-%d \n", year, month, day);
		System.out.printf("날짜 : %2d-%2d-%2d \n", year, month, day); // 2칸 중 비어있는 곳이 공백으로 채워짐
		System.out.printf("날짜 : %02d-%02d-%02d \n", year, month, day); // 2칸 중 비어있는 곳이 0으로 채워짐
		System.out.printf("나의 혈액형은 %c형 입니다.\n", blood);
		System.out.printf("평균 : %f \n", avg); // %f: 소숫점 이하가 6자리로 출력
		System.out.printf("평균 : %3.1f점 \n", avg); // %3.1: 전체자리수 3자리(모자라도 상관없음), 소숫점이하 자리수 1자리
		System.out.printf("평균 : %10.2f점 \n", avg); // %10.2: 전체자리수 10자리(남을 경우 공백 처리), 소숫점이하 자리수 2자리
		System.out.printf("평균 : %-10.2f점 \n", avg); // %-10.2: 전체자리수 10자리(왼쪽으로 출력, 남을 경우 공백 처리), 소숫점이하 자리수 2자리
  }
}
