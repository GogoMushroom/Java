package ch08_1_interface;
interface Searchable {// 기능중심 able
	void search(String url);
}




class SmartTelevision implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를켭니다");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현제 Audio 볼륨 " + this.volume);

	}
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

}

public class SmartTelevisionExample{
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		
		stv.turnOn();
		stv.turnOff();
		stv.search("google");
		
		RemoteControl rc = stv;
		//smartTelevision이 remotecomtrol로 자동형변환이 일어남
		rc.turnOn();
		//형변환이 일어나면 스마트티비의 기능은 사용할 수 없음 
		//리모콘의 기능만 사용가능 
		
		Searchable sc= stv;
		//smartTelevision이 searcheble로 자동형변환이 일어남
		sc.search("www.google.com");
		//Searchable 의 기능만 사용가능 
		
	}
}
