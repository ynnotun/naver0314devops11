package day0319;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex10_DateNumberFormat {
	public static void main(String[] args) {

		// 현재 날짜를 문자열로 출력하기
		Date date = new Date();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date)); // 2024-03-19 16:33:15 화
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEEE");
		System.out.println(sdf2.format(date)); //2024-03-19 오후 04:33:56 화요일
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf3.format(date)); //2024년 03월 19일 16시 34분
				
		
		// 숫자 포멧양식 지정하기
		int money = 5678900;
		double average = 98.7256;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money));
		
		// 따로 생성없이 바로 메서드 호출해도 됨
		System.out.println(NumberFormat.getInstance().format(money)); //5,678,900
		System.out.println(NumberFormat.getCurrencyInstance().format(money)); //₩5,678,900 (화폐단위 출력)
		
		// 평균값을 소수점이하 1자리로 출력하기
		// 사용할 일이 잘 없음
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1);
		System.out.println(nf2.format(average)); // 98.7 : 소수점 두번째 자리에서 반올림
		
	}
	
}
