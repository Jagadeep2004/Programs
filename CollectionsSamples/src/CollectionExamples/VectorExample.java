package CollectionExamples;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>(3,5);
		System.out.println("Vector capacity :"+v.capacity());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");
		v.add(1,"I");
		System.out.println("Vector size :"+v.size());
		System.out.println("Vector capacity :"+v.capacity());
		System.out.println(v);
		v.remove(5);
		v.remove("H");
		System.out.println(v);

	}

}
