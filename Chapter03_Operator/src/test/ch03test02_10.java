package test;

public class ch03test02_10 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
//		double var4 = var1*var1*var2 + "." + var3;
//   ���� ���� ���ϴ� ���� ������ * ������ * ������		
		double var4 = var1*var1*Double.parseDouble(var2 + "." + var3);
// �ڿ��� 3.14 �� ���;ߵǼ� int ���� ����� �ٲ㼭 ������� ���� �ڵ����� ����� �ٲ�  		
		
		System.out.println("���� ����:" + var4);
		
	}
}
