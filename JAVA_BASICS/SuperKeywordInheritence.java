package JAVA_BASICS;

class Vehicle{
	String brand = "Audi";
	
	void details() {
		System.out.println("Details :");
	}
	
}
class Car extends Vehicle{
	String carModel = "Gear";
	
	void display() {
	System.out.println(carModel);
	System.out.println(super.brand);
	}
	 
}
public class SuperKeywordInheritence {

	public static void main(String[] args) {
		Car c = new Car();
		c.details();
		c.display();
		
	}

}
