package ch09_1_inner;

class Button {
	//�������̽� Ÿ�� �ʵ� 
	OnClickListener listener;  // int a �� �������� ����Ÿ�� �����̸�
	
	//�Ű������� ���⼺
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	
	}	
	
	//������ü�� onClick()�޼ҵ� ȣ�� 
	void touch() {
		listener.onClick();
	}
	
	//��ø�������̽� 
	static  interface OnClickListener{
		void onClick();
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("��ȭ�� �̴ϴ�.");	
	}
}

class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
	System.out.println("�޼����� �����ϴ�");	
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
