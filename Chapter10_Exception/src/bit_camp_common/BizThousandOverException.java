package bit_camp_common;


public class BizThousandOverException extends Exception {//ObjectŬ������ �ڵ� ��� �޵��� throws�� �ѱ� Ŭ������ Exception�� ��ӹ޴´�.
	@Override
	public 
	String toString() {
		return "������� 1000�� �ѽ��ϴ�. Ȯ�� ���!!";
	}
	
	public String getMessage() {
			return "�Է¿���";
		}
	
}