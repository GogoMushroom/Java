package ch07_1_inheritance;
//                                 is 관계 상속 관계
public class DmbCellphone extends Cellphone {
//             자식클래스 				부모클래스
	//필드 
	//Cellphne 에서 상속된 필드는 안써도됨 
	int channel;
	
	//has 관계 
	//Cellphone cell;
	
	
	//생성자 

//		생성자를 적어놓지 않았다면 
//		DmbCellphone(){
//		super();
//	    }
//		생성자가 자동 생성됨 	
	
	DmbCellphone (String model, String color, int channel){                             		
		this.model = model;
		this.color = color;//Cellphone 클래스부터 상속받은것 
		
		this.channel = channel; //지금 클래스에 있는 필드
		System.out.println("자식생성자 call");
	}
	//메소드
	void turnOnDmb () {
		System.out.println("채널" + channel + "번" );
	}
	void ChangeChannelDmb (int Channel) {
		this.channel = channel;
		System.out.println("채널" + channel +"바꿈");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}
