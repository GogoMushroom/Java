package ch06_3_constructor;

public class Car{
	//�ʵ�
	String company;
	String model;
	String colors;
	int maxSpeed; 

	//������
	//������1
	Car() {
	}
	//������2
	Car(String model) {
		this(model,"����",250); 
	}
	//������3
	Car(String model, String colors) {
		this(model, colors,250);
	}
	Car(String model, String colors, int maxSpeed) {
		this.model = model;
		this.colors = colors;
		this.maxSpeed = maxSpeed;
	}


int add(int x) {
	return 0;
}
int add (int x, int y ) {
	return 0;
}
int add (int x, int y, int z) {
	return 0;

}
}





