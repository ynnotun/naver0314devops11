package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * score.txt를 읽어서 총 개수와 총점 평균을 구하시오
 * 단, 점수에 문자가 있는 경우 개수에서 제외하고 총점에서도 제외하고 출력 되도록 하기
 * 
 * 개수 : 13개
 * 총점 : 
 * 평균 : 
 * */

public class Ex17_ExceptionMunje {

	static final String FILENAME = "D:\\naver0314\\score.txt";
	public static void readScore(){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(FILENAME);
			System.out.println("** 파일을 읽습니다 **");
			
			br = new BufferedReader(fr);
			int sum = 0;
			int count = 0;
			while(true) {
				// 파일의 내용을 한줄씩 읽어온다
				String line = br.readLine();

				// 만약 더이상 데이터가 없을 경우 null값이 반환된다
				if(line == null) break;
				
				try {
					sum += Integer.parseInt(line);
					count++;
				} catch (NumberFormatException e) {
					System.out.println("잘못된 입력값 발견");
				}
//				String []content = line.split("\n");
//				for(int i = 0; i<content.length; i++) {
//					try {
//						sum += Integer.parseInt(content[i]);
//						count++;
//					} catch (NumberFormatException e) {
//						System.out.println("잘못된 입력값 발견");
//					}
//				}
			}
			
			System.out.println("개수 :"+ count);
			System.out.println("총점 :"+ sum);
			System.out.println("평균 :"+ (double)sum / count);
		} catch (FileNotFoundException e) {
			System.out.println("** 파일이 없어요 **");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 나중에 열린 자원을 먼저 닫아야 함
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		readScore();
	}
}
