package constructors;

public class Car {
	String color;
	String model;
	double price;
	void drive() {
		System.out.println("its drive like broom broom");
	}
	void honk() {
		System.out.println("it's honk like pawnn pawnn");
	}
	Car(String color,String model,double price){
		this.color=color;
		this.model=model;
		this.price=price;
	}
}
class CarApp {

	public static void main(String[] args) {
		Car c1=new Car("Black","Seltos",1600000);
		c1.drive();
		c1.honk();
		System.out.println(c1.color+","+c1.model+","+c1.price);
		Car c2=new Car("Red","i10",1200000);
		c2.drive();
		c2.honk();
		System.out.println(c2.color+","+c2.model+","+c2.price);
	}
}
