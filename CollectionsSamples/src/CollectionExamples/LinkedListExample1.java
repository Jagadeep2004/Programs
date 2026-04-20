package CollectionExamples;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		System.out.println("LinkedList size :"+ll.size());
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.addFirst("E");
		ll.addLast("F");
		ll.add("G");
		ll.add("H");
		ll.add("I");
		System.out.println("LinkedList size :"+ll.size());
		System.out.println(ll);
		ll.remove(5);
		ll.remove("H");
		System.out.println(ll);
		
	}

}