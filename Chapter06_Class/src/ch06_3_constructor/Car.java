package ch06_3_constructor;

public class Car{
	//琶球
	String company;
	String model;
	String colors;
	int maxSpeed; 

	//持失切
	//持失切1
	Car() {
	}
	//持失切2
	Car(String model) {
		this(model,"精事",250); 
	}
	//持失切3
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





