package ch09_2_anonymous;

class Button {
	
	//�������̽� Ÿ�� �ʵ� 
	OnClickListener listener;
	
	//�Ű������� ���⼺
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}	

void touch () {
	listener.onClick();  //���� ��ü��onClick()�޼ҵ� ȣ�� 
}

//��ø �������̽� 
static interface OnClickListener{ 
	void onClick();
}
}


class Window{
	Button b1 = new Button();
	Button b2 = new Button();

	
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {System.out.println("��ȭ�� �̴ϴ�");}};
	
Window() {
 b1.setOnClickListener(listener);
 b2.setOnClickListener(new Button.OnClickListener() {
	
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("�޼����� �����ϴ�.");
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
