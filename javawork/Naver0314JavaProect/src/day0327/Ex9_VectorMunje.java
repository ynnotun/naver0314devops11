package day0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1. 학생정보추가 : 이름, 나이, 3과목 점수 입력
 * 2. 학생정보삭제 : 이름으로 찾아서 삭제(없을 경우 메시지 출력)
 * 3. 전체출력 : 번호, 이름, java, Spring, Html, 총점, 평균, 등급 출력
 * 4. 평균으로 검색 : 평균값을 입력하면 그 평균값 이상의 학생들을 출력
 * 5. 이름으로 검색 : 입력한 이름을 포함하고 있으면 출력(contains) 
 * 6. 저장 후 종료
 * */

public class Ex9_VectorMunje {
	List<StudentDto> list = new ArrayList<StudentDto>();
	Scanner sc = new Scanner(System.in);
	static final String FILENAME = "d:/naver0314/student.txt";
	

	public Ex9_VectorMunje() {
		studentReadFile();
	}
	
	// 파일 읽기 - 처음 생성 시 자동으로 파일에서 멤버 읽어오기
	public void studentReadFile() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while(true) {
				String s = br.readLine();
				if(s==null) break;
				//,로 분리하기
				String []a = s.split(",");
				//StudentDto 생성 후 setter로 데이터 넣기
				StudentDto dto = new StudentDto();
				dto.setName(a[0]);
				dto.setAge(Integer.parseInt(a[1]));
				dto.setJava(Integer.parseInt(a[2]));
				dto.setSpring(Integer.parseInt(a[3]));
				dto.setHtml(Integer.parseInt(a[4]));
				
				//list 에 추가
				list.add(dto);
			}
			System.out.println("총 "+list.size()+"명의 멤버 정보를 읽어왔어요!!");
		} catch (FileNotFoundException e) {
			System.out.println("읽어올 멤버 정보가 없습니다");
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException | NullPointerException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	// 종료시 파일 저장
	private void studentFileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(StudentDto dto: list) {
				String s = dto.getName()+","+dto.getAge()+","+dto.getJava()+","+dto.getSpring()+","+dto.getHtml()+"\n";
				fw.write(s);
			}
			System.out.println("총 "+ list.size()+"정보를 파일에 저장하였습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException | NullPointerException e) { // 여러 exception 처리
				e.printStackTrace();
			}
		}
	}
	
	// 메뉴 선택
	private int getMenu() {
		int menu = 0;
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보삭제");
		System.out.println("3. 전체출력");
		System.out.println("4. 평균으로 검색");
		System.out.println("5. 이름으로 검색");
		System.out.println("6. 저장 후 종료");
		System.out.println("=============");
		
		try {
			menu = Integer.parseInt(sc.nextLine());			
		} catch (NumberFormatException e) { // 문자 입력 시 발생하는 Exception
			System.out.println("번호를 숫자로 입력해주세요");
		}
		return menu;
		
	}
	
	// 멤버 데이터 추가
	public void addStudent() {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		int age, java, spring, html;

		System.out.println("나이를 입력하세요");
		try {
			age = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			age = 0;
		}
		
		System.out.println("자바 점수를 입력하세요");
		try {
			java = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			java = 0;
		}
		
		System.out.println("스프링 점수를 입력하세요");
		try {
			spring = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			spring = 0;
		}
		
		System.out.println("HTML 점수를 입력하세요");
		try {
			html = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			html = 0;
		}
		
		StudentDto dto = new StudentDto(name, age, java, spring, html);
		list.add(dto); // list에 추가
		System.out.println(list.size()+"번째 멤버 정보를 추가하였습니다!");
	}
	
	// 멤버 삭제
	public void deleteStudent() {
		boolean f=false;
		System.out.println("삭제할 멤버명을 입력하세요");
		String name=sc.nextLine();
		for(int i=0;i<list.size();i++)
		{
			StudentDto dto=list.get(i);
			if(dto.getName().equals(name))
			{
				f=true;
				list.remove(i);
				break;
			}
		}
		if(f)
			System.out.println(name+"님의 정보를 삭제하였습니다");
		else
			System.out.println(name+"님은 명단에 없습니다");
	}
	
	// 전체 멤버 출력
	public void writeStudent() {
		System.out.println("\t** 전체 학생 명단 **\n");
		System.out.println("=".repeat(70));
		System.out.println("번호\t이름\t나이\t자바\t스프링\tHTML\t총점\t평균\t등급");
		System.out.println("=".repeat(70));
		
		for(int i=0;i<list.size();i++)
		{
			StudentDto dto=list.get(i);
			System.out.println(i+1+"\t"+dto.getName()+"\t"+dto.getAge()+"\t"
			+ dto.getJava()+"\t"+dto.getSpring()+"\t"+ dto.getHtml()+"\t"+ dto.getTotal()+"\t"+ dto.getAvg()+"\t"+ dto.getGrade());
		}
		System.out.println("=".repeat(70));
	}
	
	// 이름으로 검색
	public void searchName() {
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		boolean f = false;
		
		for(int i=0;i<list.size();i++)
		{
			StudentDto dto=list.get(i);
			if(dto.getName().contains(name))
			{
				f = true;
				System.out.println("이름 : "+dto.getName());
				System.out.println("나이 : "+dto.getAge());
				System.out.println("자바 점수 : "+dto.getJava());
				System.out.println("스프링 점수 : "+dto.getSpring());
				System.out.println("HTML 점수 : "+dto.getHtml());
			}
		}
		
		if(!f) System.out.println(name+"님은 명단에 없습니다");

	}
	
	// 평균으로 검색
	public void searchPhone() {
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		boolean f = false;
		for(int i=0;i<list.size();i++)
		{
			StudentDto dto=list.get(i);
			if(score <= dto.getAvg())
			{
				f = true;
				System.out.println("이름 : "+dto.getName());
				System.out.println("나이 : "+dto.getAge());
				System.out.println("자바 점수 : "+dto.getJava());
				System.out.println("스프링 점수 : "+dto.getSpring());
				System.out.println("HTML 점수 : "+dto.getHtml());
				break;
			}
		}
		
		if (!f) System.out.println("입력한 점수 이상의 학생을 모두 출력하였습니다");
		else System.out.println(score+"점 이상의 평균 점수를 가진 학생은 없습니다");

	}
	
	public static void main(String[] args) {
		Ex9_VectorMunje ex = new Ex9_VectorMunje();
		
		while(true) {
			int menu = ex.getMenu();
			switch(menu) {
			case 1:
				ex.addStudent(); break;
			case 2:
				ex.deleteStudent(); break;
			case 3:
				ex.writeStudent(); break;
			case 4:
				ex.searchPhone(); break;
			case 5:
				ex.searchName(); break;
			case 6:
				ex.studentFileSave();
				System.out.println("** 멤버 정보를 저장 후 종료합니다 **");
				System.exit(0); // 종료
				break;
			default:
				System.out.println("잘못된 번호 입니다");
			}
			System.out.println();
		}
	}
}
