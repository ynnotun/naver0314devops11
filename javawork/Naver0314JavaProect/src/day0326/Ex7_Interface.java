package day0326;

interface StudyInter {
	public void javaStudy();
	public void springStudy();
}

interface PlayInter {
	public void run();
	public void game();	
}


class MyStudy implements StudyInter {
	@Override
	public void javaStudy() {
		// TODO Auto-generated method stub
		System.out.println("자바 공부합니다");
	}
	
	@Override
	public void springStudy() {
		// TODO Auto-generated method stub
		System.out.println("스프링 공부합니다");
	}
}

class MyPlay implements PlayInter {
	@Override
	public void run() {
		System.out.println("뜁니다");
	}
	
	@Override
	public void game() {
		System.out.println("놉니다");		
	}
}

public class Ex7_Interface {
	
	public static void study(StudyInter s) {
		s.javaStudy();
		s.springStudy();
	}
	
	public static void play(PlayInter p) {
		p.run();
		p.game();
	}
	public static void main(String[] args) {
		study(new MyStudy());
		play(new MyPlay());
	}
}
