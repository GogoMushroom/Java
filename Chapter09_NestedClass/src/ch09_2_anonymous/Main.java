package ch09_2_anonymous;

class Button {
	
	//인터페이스 타입 필드 
	OnClickListener listener;
	
	//매개변수의 다향성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}	

void touch () {
	listener.onClick();  //구현 객체의onClick()메소드 호출 
}

//중첩 인터페이스 
static interface OnClickListener{ 
	void onClick();
}
}


class Window{
	Button b1 = new Button();
	Button b2 = new Button();

	
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {System.out.println("전화를 겁니다");}};
	
Window() {
 b1.setOnClickListener(listener);
 b2.setOnClickListener(new Button.OnClickListener() {
	
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("메세지를 보냅니다.");
	}});
}
}



public class Main {
	public static void main(String[] args) {
		Window w = new Window();
		w.b1.touch();
		w.b2.touch();
	}
}
