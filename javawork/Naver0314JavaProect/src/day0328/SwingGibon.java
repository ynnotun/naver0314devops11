package day0328;

import java.awt.Color;
import javax.swing.JFrame;

public class SwingGibon extends JFrame{
	public SwingGibon (String title) {
		super(title);
		this.setLocation(100, 100); // 시작위치
		this.setSize(300,300); // 창 크기
//		this.getContentPane().setBackground(new Color(93, 19, 17)); // RGB로 변경
		this.getContentPane().setBackground(Color.GRAY); // 상수로 사용
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료
		this.initDesign(); // 각종 컴포넌트 생성
		this.setVisible(true);
		
	}
	public void initDesign() {
		
	}
	public static void main(String[] args) {
		SwingGibon a = new SwingGibon("기본창");
	}
}
