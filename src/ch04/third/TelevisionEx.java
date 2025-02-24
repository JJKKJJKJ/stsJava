package ch04.third;

public class TelevisionEx {
	public static void main(String[] args) {
		Television television = new Television();
		television.turnOn();
		
		SettopBox settopBox = new SettopBox();
		settopBox.turnOn();
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
	}

}
