package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellphone dc = new DmbCellphone("자바폰", "검정", 10);
		
		//Cellphone 클래스로부터 상속받은 필드
		System.out.println("모델" + dc.model);
		System.out.println("색" + dc.color);
		
		//DmbCellphone 클래스의 필드 
		System.out.println("체널" + dc.channel);
		
		//Cellphone 클래스로부터 상속잗은 메소드 호출 
		dc.powerOn();
		dc.powerOff();
		dc.sendVoice("안녕하세요");
		dc.recieveVoice("안녕하세요");
		dc.sendVoice("안녕히계세요");
		dc.hangUp();
		
		//DmbCellphone 클래스의 메소드  호출 
		dc.turnOffDmb();
		dc.ChangeChannelDmb(12);
		dc.turnOffDmb();
		
		
	}

}
