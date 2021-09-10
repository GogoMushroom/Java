package hotel;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class HotelMap {
	private Scanner sc;
	private Map<String, HotelVO> hotelMap;
	
	public HotelMap() {
		sc = new Scanner(System.in);
		hotelMap = new HashMap<>();
	}
	// ���α׷� ����
	public void hotelOpen() {
		System.out.println("*******************************");
		System.out.println("\tȣ�� ���� �������ϴ�.\t");
		System.out.println("*******************************");
		while (true) {
			System.out.println("************************************");
			System.out.println("� ������ �Ͻðڽ��ϱ�?");
			System.out.println("1.üũ��    2.üũ�ƿ�     3.���ǻ���     4.��������");
			System.out.println("************************************");
			System.out.println();
			int menuNum = sc.nextInt(); // �޴� ��ȣ �Է�
			sc.nextLine();
			switch (menuNum) {
			case 1:
				checkIn(); // üũ��
				break;
			case 2:
				checkOut(); // üũ�ƿ�
				break;
			case 3:
				roomState(); // ���ǻ���
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�...");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ��Է��ϼ���.");
			} // switch��
		} // while��
	}
	
	/**
	 * �� ������ �����ϴ� �޼���
	 */
	private void checkOut() {
		System.out.println();
		System.out.println("��� ���� üũ�ƿ� �Ͻðڽ��ϱ�?");
		System.out.print("���� ��ȣ >> ");
		String rNum = sc.next();
		if(hotelMap.remove(rNum) == null) {
			System.out.println(rNum + " �� �濡 ��� ���� ������ �����ϴ�.");
		} else {
			System.out.println("üũ�ƿ��ϼ̽��ϴ�. ���� ȣ���� �̿����ּż� �����մϴ�.");
			System.out.println("���� �Ϸ� �ǽʽÿ�. ����.");
		}
	}
	
	
	
	/**
	 * ȣ�ڿ� �ӹ��� ������ ���� ���¸� �˷��ִ� �޼���
	 */
	private void roomState() {
		Set<String> keySet = hotelMap.keySet();
		System.out.println("=====================================");
		System.out.println(" ��ȣ\t���ǹ�ȣ\t\t�̸� ");
		System.out.println("=====================================");
		
		if(keySet.size() == 0) {
			System.out.println("��ϵ� ���� �����ϴ�");
		} else {
			Iterator<String> it = keySet.iterator();
			
			int count = 0;
			while(it.hasNext()) {
				count++;
				String rNum = it.next();
				HotelVO h = hotelMap.get(rNum);
				System.out.println(" " + count + "��"+ "\t" +"���ȣ : "+ h.getrNum() +"\t" + "������ : "+ h.getName());

			}
		}
		System.out.println("================================");
	}
	
	/**
	 * ���ο� �� ������ ����ϴ� �޼���
	 */
	private void checkIn() {
		System.out.println();
		System.out.println("��� �濡 üũ�� �Ͻðڽ��ϱ�?");
		System.out.print("�� ��ȣ �Է� => ");
		String rNum = sc.next();
		
		if(hotelMap.get(rNum) != null) {
			System.out.println("�˼��մϴ�. �ٸ� �մ��� ���� ������Դϴ�.");
			return;
		}
		
		sc.nextLine();
		System.out.println("������ ��� �ǽʴϱ�?");
		System.out.print("�̸� �Է� => ");
		String name = sc.next();
		
		hotelMap.put(rNum, new HotelVO(rNum, name));
		System.out.println(name + " �� üũ�� �غ� �Ϸ�Ǿ����ϴ�.");
		
	}
	
	
	public static void main(String[] args) {
		new HotelManager().hotelOpen();
	}


}

/**
 * ���� ������ �����ϱ� ���� VOŬ����
 */
class HotelVO{
	private String rNum;
	private String name;
	
	public HotelVO(String rNum, String name) {
		super();
		this.name = name;
		this.rNum = rNum;
	}
	
	public String getrNum() {
		return rNum;
	}


	public void setrNum(String rNum) {
		this.rNum = rNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Hotel [rNum=" + rNum + ", name=" + name + "]";
	}
}