package day0328;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex4_SwingButton extends JFrame{
	
	JButton btn1, btn2;
	
	public Ex4_SwingButton (String title) {
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
		this.setLayout(null); // 기본 레이아웃 없애기
		// 버튼 1 생성
		btn1 = new JButton("hello");
		// 프레임에 추가
		btn1.setBounds(10, 10, 100, 30); // x, y, w, h
		this.add(btn1);
		// btn1 이벤트 추가 - 익명 내부 클래스 형태로 이벤트 구현
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Ex4_SwingButton.this, "버튼 1을 눌렀어요");
			}
		});
		
		// 버튼 2 생성
		btn2 = new JButton("오이오이");
		// 프레임에 추가
		btn2.setBounds(150, 10, 100, 30); // x, y, w, h
		this.add(btn2);
		btn2.addActionListener(new Button2Event());
	}
	
	// 버튼 2 이벤트
	class Button2Event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showConfirmDialog(Ex4_SwingButton.this, "맛있는 점심 먹고 오세용");
		}
	}
	public static void main(String[] args) {
		Ex4_SwingButton a = new Ex4_SwingButton("스윙버튼");
	}
}
