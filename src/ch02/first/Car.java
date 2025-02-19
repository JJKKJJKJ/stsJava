package ch02.first;

public class Car {

	String color;
	String name;
	int speed;
	String brand;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
//	public Car() {
//		// TODO Auto-generated constructor stub
//		this.color = "white";
//		this.name = "sonata";
//		this.speed = 3;
//		this.brand = "hyundai";
//	}
	
	public Car(String color, String name, int speed, String brand) {
		this.color = color;
		this.name = name;
		this.speed = speed;
		this.brand = brand;
	}
	
//	String  a = "시동을 끕니다";
//	System.out.println(a);
//	String off(String a) {
//		return a;
//	}
	
//	void off(String a) {
//		System.out.println(a);
//	}
	
	void off2() {
		System.out.println("시동을 끕니다");
	}
	void on() {
		System.out.println("시동을 킵니다");
	}
}
