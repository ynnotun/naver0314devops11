package day0325;

public class Employee {
	private String name;
	private String position;
	private int age;
	private int gibon;
	private int sudang;
	
	// constructor
	Employee() {
		super();
	}

	Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Employee(String name, String position, int age) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	public void setSawon(String name, String position, int age) {
		this.name = name;
		this.position = position;
		this.age = age;
	}
	
	public void setPay(int gibon, int sudang) {
		this.gibon = gibon;
		this.sudang = sudang;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}

	public int getGibon() {
		return gibon;
	}
	
	public int getSudang() {
		return sudang;
	}

	public int getNetPay() {
		return gibon + sudang;
		
	}
	


}
