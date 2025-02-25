package tr.java;

import java.awt.Toolkit;

public class ToolKit {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			try {Thread.sleep(500);}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		///인터페이스 = 대비  / 쓰레드 => 동시에 여러개 실행
	}

}
