package ch10_2_exception_handling;

public class CatchByExcaptionKindExample {
	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];
			int v1 = Integer.parseInt(data1);
			int v2 = Integer.parseInt(data2);
			int result = v1+v2;

			System.out.printf("%d+%d=%d",v1,v2,result);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ຯ������ �� ����");
		}catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �Ұ�");
		}finally {
			System.out.println("�ٽ� ����");
		}
		System.out.println("���α׷� ����");
	}
}