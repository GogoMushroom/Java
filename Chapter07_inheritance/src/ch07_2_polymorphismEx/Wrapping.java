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
	private static void wrapBox (Box box) {	//Box���� box
		//box �� ������� �˾ƺ��¹� 
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox) box).GoldPaperWrap();
			//�ڷ����� GoldPaperBox�� ����ȯ �� ����� 
		}else if (box instanceof PaperBox) {
			((PaperBox) box).PaperWrap();
			//�ڷ����� PaperBox�� ����ȯ �� ����� 
		}else {
			box.simpleWrap();
		}
	}
}
