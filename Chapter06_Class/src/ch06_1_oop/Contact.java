package ch06_1_oop;

public class Contact { //메인메소드가 포함된 클래스 
	public static void main(String[] args) {
		//static 메소드 영역 메모리에 메소드를 생성해줌
		//메인도 class 소속 메소드임
		Contact con = new Contact();//메모리에서 생성, 주소값은 con이라는 변수에 넣음  
		con.setName("김자바");
			System.out.println(con.getName());
		con.setFaxNumber("0101010101");	
			System.out.println(con.getFaxNumber());
		con.setEmailAdress("wwwww@WWWWW");
			System.out.println(con.getEmailAdress());
	}



	}
}
 
class Contact { 
	//인스턴스를위한 클래스임 
	String emailAdress;  
	String FaxNumber;
	String name; //필드 
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getFaxNumber() {
		return FaxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		FaxNumber = faxNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	}
	//마우스 우클릭 소스 getters setters 

	}
