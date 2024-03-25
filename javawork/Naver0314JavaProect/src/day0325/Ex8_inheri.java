package day0325;


class Phone2 {
	private String model;
	private String color;
	
	// setter
	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// getter
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	

}

class SmartPhone2 extends Phone2 {
	private String wifi;
}

public class Ex8_inheri {
	public static void main(String[] args) {
		
		SmartPhone2 s1 = new SmartPhone2("갤럭시", "은색", "KT");
		s1.info();
		
		SmartPhone2 s2 = new SmartPhone2("아이폰14", "핑크색", "SK");
		s2.info();
		
	}
}
