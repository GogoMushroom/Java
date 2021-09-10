package hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {

	Scanner sc = new Scanner(System.in);
	LinkedList<Customer>list = new LinkedList<Customer>();
	LinkedList<Customer>login= new LinkedList<Customer>();
	
	public void newCustomer() {//ȸ�� ����
		
		//�� ����Ʈ
		
		System.out.print("id:");
		String id=sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pwd=sc.nextLine();
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo=sc.nextLine();
		System.out.print("ī���ȣ: ");
		String cardNo=sc.nextLine();
	
	
	list.add(new Customer(id, pwd, name, phoneNo, cardNo));
	
	
	}
	
	public List<Customer> name() {
	
	int a =-1;
	
	while (a==-1 || login.isEmpty()) {
		System.out.print("1: ȸ������   2: �α��� >> ");
		String input = sc.nextLine();
		if(input.equals("1")) {
			newCustomer();
		} else if (input.equals("2")) {
			login = (LinkedList<Customer>) login();
			a=1;
		}
	}
	return login;
	}
	
	public List<Customer>login() {
		LinkedList<Customer>list2 = new LinkedList<Customer>();
		
		String id;
		String pwd;
		
		
		for(int i=0; i<list.size(); i++) {
			
			do {
				System.out.println("id: ");
				id=sc.nextLine();
				System.out.println("��й�ȣ: ");
				pwd=sc.nextLine();
				
				if(!(list.get(i).getId().equals(id))||!(list.get(i).getPwd().equals(pwd))){
					System.out.println("�ٽ� �Է��ϼ���.");
				}
				
			}while (!(list.get(i).getId().equals(id))||!(list.get(i).getPwd().equals(pwd)));
			
			list2.add(0, new Customer(list.get(i).getId(), list.get(i).getPwd(), list.get(i).getName(), list.get(i).getPhoneNo(), list.get(i).getIden()));
			
			System.out.println(list.get(i).getName()+ "�� �ݰ����ϴ�.");
		
		
		}return list2;
	}
	
	public void updateCustomer() { // ȸ������ ����
		System.out.print("id: ");
		String id= sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pwd= sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)&& list.get(i).getPwd().equals(pwd)) {
				//�α��� ����
				System.out.print("�̸�: ");
				String name=sc.nextLine();
				System.out.print("��ȭ��ȣ: ");
				String phoneNo=sc.nextLine();
				System.out.print("�ֹε�Ϲ�ȣ: ");
				String iden=sc.nextLine();
				
				list.remove(i);
				list.add(i, new Customer(id,pwd, name, phoneNo, iden));
				}
			}
		}	// ������Ʈ �޼ҵ� �ϼ�
	
	public void removeCustomer() {
		System.out.print("id: ");
		String id= sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pwd= sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)&& list.get(i).getPwd().equals(pwd)) {
				//�α��� ����
				System.out.print("������ Ż���Ͻðڽ��ϱ�? (1:��   2:�ƴϿ�) >>");
				String input =sc.nextLine();
				if(input.contentEquals("1")) {
					list.remove(i);
				}
				else return;
			}
		}
	}//remove �޼ҵ� ����
}
