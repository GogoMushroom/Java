package pactice;

public class Outter {

	private  int outerIv = 0;
	static int outerCv = 0;
	
	class  InstanceInner{
		int liv = outerIv;  //1.�ܺ� Ŭ������ private ����� ���� Ŭ�������� ��밡�� 
		int liv2 = outerCv;
	}
	
	static class  StaticInner{
		//����ƽ Ŭ������ �ܺ�Ŭ������ �ν��Ͻ� ����� ������ �� ����.
		//int siv = outerIv; 
		static int scv = outerCv;
	}
	
	void myMethod() {//�������� �޼��� ����� �Բ� �Ҹ�Ǳ� ������ ����� ���� 
		
		//int lv - 0;// ������ �ȵ� 
		final int LV = 0; //����� �� 
		
		class LocalInner{ //2.���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��밡�� 
			int liv = outerIv;
			int liv2 = outerCv;
			
			//int liv3 = lv; // ����
			int liv4 = LV; 
			
		}
	}
	
}
