package ch02.first;

public class CarEx {
	public static void main(String[] args) {
//		String a = "fdsfa";
//		off(a);
		Car car1 = new Car();
		Car car2 = new Car("pink", "SM3", 180, "르노");
		Car car3 = new Car("black", "k5", 200, "KIA");
		Car car4 = new Car("pupple", "Kona", 300, "HYUNDAI");
		
		car1.off2();
		car2.on();
		System.out.println(car2.name);
		System.out.println(car4.name);
	}

}
