package practice;
abstract class Unit {
	int x,y;
	abstract void move (int x,int y);
	void stop() {System.out.println("����");}
	}

interface Fighterble {//interface �� ��� �޼���� public abstract. ���ܾ���
	void move (int x,int y); //public abstract �� ���ʿ� ������
	void attack (Fighterble f); //public abstract �� ���ʿ� ������
}

class Fighter extends Unit implements Fighterble {
	@Override
	// �������̵� ��Ģ = ���󺸴� ���������ڰ� ������ �ȵȴ�.
	public void move(int x, int y) { 
		// TODO Auto-generated method stub
		System.out.printf("%d , %d �� �̵�\n", x , y);
	}
	@Override
	public void attack(Fighterble f) {
		System.out.println(f+"�� ����");
		
	}	
	//�ο� �� �ִ� ��븦 �ҷ��´�
	Fighterble getFightable() {
		Fighter f = new Fighter(); //Fighter �� �����ؼ� ��ȯ�� 
		return (Fighterble)f;
	}
	
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fighterble f2 = f.getFightable();
		
		
	//	Fighter f = new Fighter();
//		Fighterble f = new Fighter();
		Unit u = new Fighter(); //unit���� attack() �� ���� 
		f.move(100, 200);
		f.attack(new Fighter());
		//f.stop(); // ���� 
		u.move(200, 100);
		u.stop();
		//u.attack(new Fighter());// unit���� attack() �� ���� 
		
//		Fighter f2= new Fighter();
//		f.attack(f2);   // f.attack(new Fighter()); �� 2�ٷ� �� ���� ���� 
		
	}
}
