package CollectionExamples;

import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityqueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> v=new PriorityQueue<>();
		System.out.println("Priority Queue capacity :"+v.size());
		v.add(8);
		v.add(6);
		v.add(5);
		v.add(9);
		v.add(3);
		v.add(1);
		v.add(4);
		v.add(2);
		v.add(7);
		System.out.println("Priority Queue capacity :"+v.size());
		System.out.println(v);
		System.out.println(v.remove());
		System.out.println(v);

	}

}