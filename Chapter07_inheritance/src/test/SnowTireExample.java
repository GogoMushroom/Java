package test;

class Tire{
	public void run() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�");
	}
}

class SnowTire extends Tire {
		@Override
		public void run() {
			System.out.printf("�����Ÿ�̾ �������ϴ�.");
		}
	}

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		}		
	}

