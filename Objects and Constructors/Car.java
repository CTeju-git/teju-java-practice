package states_and_behaviours;

public class Car {
	String color;
	String model;
	double price;
	String manufacturer;
	void drive() {
		System.out.println("its drive like broom broom");
	}
	void honk() {
		System.out.println("its sounds like pawnn pawnn");
	}
}
class CarApp{
	public static void main(String[] args) {
		Car c=new Car();
		c.color="red";
		c.price=1300000;
		c.model="brezza";
		c.manufacturer="maruti suzaki";
		c.drive();
		c.honk();
		System.out.println("Color="+c.color+", price="+c.price+", model="+c.model+", manufacturer="+c.manufacturer);
	}
}
