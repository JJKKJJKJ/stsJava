package ch03.third;

public class SmartPhoneEx {
	public static void main(String[] args) {
		
//	Phone phone = new Phone(); 
		///└>추상(abstract) 은 객체 사용 불가 extends 해서 메소드 사용만 가능
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.open();
	}

}
