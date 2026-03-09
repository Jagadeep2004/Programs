package JAVA_BASICS;

class Sample{
	double pi = 3.14;
	final void display() {
		System.out.println(pi);
	}
}
class Sample1 extends Sample{
	void display() {
		System.out.println(super.pi);
	}
}

public class FinalkeywordExample {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.display();
	}

}
