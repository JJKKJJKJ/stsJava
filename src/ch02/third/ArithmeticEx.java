package ch02.third;

public class ArithmeticEx {
	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		
		// 7 + 8 = 15
		int sum = a+b;
		
		System.out.println(a + "+" + b + "=" + sum);
	
		System.out.println(a + "+" + b + "=" + add(a,b));
		
		Arithmetic ar = new Arithmetic(a,b);
		ar.print();
		
	}

	static int add(int a,int b) {
		return a+b;
		
	}
}


