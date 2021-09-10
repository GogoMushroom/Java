package ch09_1_inner;

class Button {
	//인터페이스 타입 필드 
	OnClickListener listener;  // int a 랑 같은거임 변수타입 번수이름
	
	//매개변수의 다향성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	
	}	
	
	//구현객체의 onClick()메소드 호출 
	void touch() {
		listener.onClick();
	}
	
	//중첩인터페이스 
	static  interface OnClickListener{
		void onClick();
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("전화를 겁니다.");	
	}
}

class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("메세지를 보냅니다");	
	}
}



public class ButtonExample {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.setOnClickListener(new CallListener());
		b.touch();
		
		b.setOnClickListener(new MessageListener());
		b.touch();
	}
	

}
