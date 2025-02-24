package ch04.third;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIX_VOLUME = 0;   
	final String name = "asda";
	
	public abstract void turnOn();
	void turnOff();  
	void setVolume(int volume);
	
	default void steMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체");
	}

}
