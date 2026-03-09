package JAVA_BASICS;

public class OverloadingPolymorphism {
	
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingPolymorphism op = new OverloadingPolymorphism();
		
		System.out.println(op.add(1, 2));
		System.out.println(op.add(1.2,5.8));
	}

}
