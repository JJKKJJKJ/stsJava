package ch03.first;

public class DmbcCellPhone extends CellPhone {

	@Override
	void powerOff() {
		System.out.println("DmbcCellPhone전원을 끕니다");
	}

	@Override
	void powerOn() {
		System.out.println("DmbcCellPhone전원을 켭니다");
	}

}
