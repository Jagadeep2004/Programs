package JAVA_BASICS;

class Vehicle_0{
	void run() {
		System.out.println("Vehicles used for transportation");
	}
}
class Truck extends Vehicle_0{
	void run() {
		System.out.println("Truck is one of the vehicle");
	}
}
public class UpcastingOverridingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle_0 v = new Vehicle_0();
		v.run();
		
		System.out.println();
		
		Vehicle_0 t = new Truck();
		t.run();

	}

}
