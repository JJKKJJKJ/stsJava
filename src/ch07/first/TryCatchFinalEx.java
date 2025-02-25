package ch07.first;

import java.awt.Toolkit;

public class TryCatchFinalEx {
	public static void main(String[] args) throws InterruptedException {
///                                          └>나 Excetion 처리안해 내함수(메소드) 쓸꺼면 다음에 쓸 너가Excetionhandling해 의미
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			Thread.sleep(500);
			
		}
	}
	
	
	public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
	public void xyz() throws InterruptedException {
		abc();
	}
}
