package ch14_2_streamLib;
import java.util.*;


class Product {
	private int pno;
	private String name;
	private int price;
	private int stock;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


}
public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private int counter;

	public void showMenu() {
		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.��� : 2.��� : 3.����");
			System.out.println("------------------------------");


			System.out.println("����");
			String selectNo = sc.nextLine();
			switch(selectNo) {
			case "1" : registerProduct(); break; 
			case "2" : showProducts(); break; 
			case "3" : return;
			}



		}
	}

	private void registerProduct() {

		try {
			Product p = new Product();
			p.setPno(++counter);

			System.out.println("��ǰ��:");
			p.setName(sc.nextLine());

			System.out.println("����:");
			p.setPrice(Integer.parseInt(sc.nextLine()));

			System.out.println("���:");
			p.setPrice(Integer.parseInt(sc.nextLine()));

			list.add(p);
		}catch(Exception e) {
			System.out.println("��� ����" + e.getMessage());
		}			
	}

	private void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno() +"\t"+ p.getName()+"\t"+ p.getPrice()+"\t"+p.getStock() );
		}
	}
}
