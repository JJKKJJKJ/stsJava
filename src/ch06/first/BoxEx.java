package ch06.first;

public class BoxEx {
	public static void main(String[] args) {
		
//		Box box = new Box();
//		
//		box.a = 1;
//		System.out.println(box.a);
		
		Box<Integer> box = new Box<>();
//		Box<Integer> box = new Box<Integer>();
		box.setT(1);
		System.out.println(box.getT());
		
//		Box<int> box2 = new Box<>();  
///          └>원시 데이터는 안됨
		
		Box<String> box3 = new Box<>();
		box3.setT("jihye");
		System.out.println(box3.getT());
		
	}

}
