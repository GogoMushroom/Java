package ch12_1_multi_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// 이 코드를 실행하는 스레드 객체 열기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:"+ mainThread.getName());

		//ThreadA 객체 생성
		ThreadA ta = new ThreadA();
		System.out.println("작업 스레드 이름 "+ ta.getName());
		ta.start();

		//ThreadB 객체 생성
		ThreadB tb = new ThreadB();
		System.out.println("작업 스레드 이름" + tb.getName());
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
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() +" 가 출력한 내용");
		}
	}
}
