package sec06.exam03.package2;

public class Car {
	
	//필드
	private int speed;
	private boolean stop;


	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//speed 값 검증 
		if (speed <0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
		
		this.speed = speed;
	}
	
	
	public boolean isStop() { //boolean 은 get이 아니라 is를 사용함 
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed =0;
		
	}
	
		
	
}
