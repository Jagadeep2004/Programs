package CollectionExamples;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> sk = new Stack<>();
		System.out.println("Stack size : "+sk.size());
		sk.push("A");
		sk.push("B");
		sk.push("C");
		sk.push("D");
		sk.push("E");
		System.out.println("Stack size : "+sk.size());
		System.out.println(sk);
		sk.pop();
		sk.add("Z");
		sk.remove("A");
		System.out.println(sk);
		
		

	}

}
