package ch03.second;

public class Studend extends  People {
	
	public int studendNo;
	
	public Studend(String name,String ssn,int studendNo) {
		super(name,ssn);
		
		this.name = name;
		this.ssn = ssn;
		this.studendNo = studendNo;
		
	}
	public Studend(String name,String ssn) {
		super(name,ssn);
	}
	public Studend() {
//		super();
		
	}

}
