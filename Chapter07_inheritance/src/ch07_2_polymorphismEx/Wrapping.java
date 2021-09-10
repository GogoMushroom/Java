package ch07_2_polymorphismEx;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box{
	public void PaperWrap() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends PaperBox{
	public void GoldPaperWrap() {
		System.out.println("Gold Wrapping");
	}
}



public class Wrapping {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	private static void wrapBox (Box box) {	//Box형의 box
		//box 가 어떤형인지 알아보는법 
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox) box).GoldPaperWrap();
			//자료형을 GoldPaperBox로 형변환 해 줘야함 
		}else if (box instanceof PaperBox) {
			((PaperBox) box).PaperWrap();
			//자료형을 PaperBox로 형변환 해 줘야함 
		}else {
			box.simpleWrap();
		}
	}
}
