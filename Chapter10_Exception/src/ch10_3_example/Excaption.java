package ch10_3_example;

class Exception1000 extends Exception{
@Override
public String toString() {
	
	return "������� 1000�� �ѽ��ϴ�";}
@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "�Է¿���";
	}

}
class Exceptionzero extends Exception{
	@Override
	public String toString() {
		
		return "������� ���� �Դϴ�";}
}
class DivzeroException extends Exception{
	@Override
	public String toString() {
		
		return "0���� ���� �� �����ϴ�";}
}


public class Excaption {
	public static void main(String[] args) {
		
		
	try {
		System.out.println(Calculator.add(1,1000));
		System.out.println(Calculator.div(1,0));
	} catch (Exception1000 e) {
		 System.out.println(e.toString());
		 System.out.println(e.getMessage());
		//System.out.println("����! ������� 1000�̳ѽ��ϴ�.");
	} catch (Exceptionzero e) {
		System.out.println(e.toString());
		//System.out.println("����! ������� ���� �Դϴ�.");
	} catch (DivzeroException e) {
		System.out.println(e.toString());
	}
	//�������� ������ �鸮�� �� 
	finally {
		System.out.println("�Է°��� Ȯ���ϼ���");
	
	
}
	System.out.println("���α׷� ���� ����");
	}}

