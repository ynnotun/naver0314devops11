package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex16_FileReaderMemo {
	
	static final String FILENAME2 = "D:\\naver0314\\memo2.txt";
	public static void readMemo2(){
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(FILENAME2);
			System.out.println("** memo2 파일을 읽습니다 **");
			
			br = new BufferedReader(fr);
			while(true) {
				// 파일의 내용을 한줄씩 읽어온다
				String line = br.readLine();
				// 만약 더이상 데이터가 없을 경우 null값이 반환된다
				if(line == null) break;
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("** memo2 파일이 없어요 **");
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
		readMemo2();
	}
}
