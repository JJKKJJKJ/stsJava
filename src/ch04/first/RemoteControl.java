package ch04.first;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	int MIX_VOLUME = 0;    // public static final 생략가능
	final String name = "asda";
	
	public abstract void turnOn();
	void turnOff();   // public abstract final 생략가능
	void setVolume(int volume);

}
