package ch09_2_anonymous;

interface RemoteControl{
	public void turnOn();
	public void turnOff();
}

class Anonymous2{

	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("tv¸¦ ÄÕ´Ï´Ù");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV¸¦ ²ü´Ï´Ù");
		}
	};

	void method1() {

		RemoteControl lvar = new RemoteControl(
				) {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Audio¸¦ ²ü´Ï´Ù");
			}
		};

		lvar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}



public class AnonimousExample2 {
	public static void main(String[] args) {
		Anonymous2 a = new Anonymous2();

		a.field.turnOn();

		a.method1();

		a.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						// TODO Auto-generated method stub
						System.out.println("Smart TV ¸¦ ÄÕ´Ï´Ù.");
					}

					@Override
					public void turnOff() {
						// TODO Auto-generated method stub
						System.out.println("Smart TV ¸¦ ²ü´Ï´Ù.");
					}
				} );
	}			
}	

