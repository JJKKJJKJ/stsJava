package ch03.first;

public class DmbcCellPhoneEx {
	public static void main(String[] args) {
		
//		CellPhone cellphone = new CellPhone();
//		cellphone.model = "SAMSUNG";
//		cellphone.color = "Black";
//		System.out.println(cellphone.model);
//		
//		CellPhone cellphone1 = new CellPhone();
//		cellphone1.model = "iphone";
//		cellphone1.color = "16";
//		System.out.println(cellphone1.model);
//		
		DmbcCellPhone dmbcCellPhone = new DmbcCellPhone();
		dmbcCellPhone.model = "SAMSUNG2";
		dmbcCellPhone.color = "Black2";
		System.out.println(dmbcCellPhone.model);
		dmbcCellPhone.powerOff();
		dmbcCellPhone.powerOn();
		
		CellPhone cellPhone2 = new CellPhone("iphone 16e" , "Black");
		System.out.println(cellPhone2.model);
		
		
		
				
	}

}
