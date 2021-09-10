package ch12_1_multi_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// �� �ڵ带 �����ϴ� ������ ��ü ����
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:"+ mainThread.getName());

		//ThreadA ��ü ����
		ThreadA ta = new ThreadA();
		System.out.println("�۾� ������ �̸� "+ ta.getName());
		ta.start();

		//ThreadB ��ü ����
		ThreadB tb = new ThreadB();
		System.out.println("�۾� ������ �̸�" + tb.getName());
		tb.start();
	}
}


class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() +" �� ����� ����");
		}
	}
}
