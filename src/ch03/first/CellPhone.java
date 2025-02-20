package ch03.first;

public class CellPhone {
	//필드
	String model;
	String color;
	
	//생성자
	CellPhone(){	
	}
	
	CellPhone(String model,String color){
		this.model = model;
		this.color = color;		
	}
	
	//메소드
	void powerOff() {System.out.println("전원을 끕니다");
	}
	void powerOn() {System.out.println("전원을 킵니다");
	}

}
