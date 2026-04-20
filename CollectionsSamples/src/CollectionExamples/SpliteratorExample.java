package CollectionExamples;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		System.out.println("Size : " + li.size());
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		System.out.println("Using tryAdvance");
		Spliterator<Integer> sitr = li.spliterator();
		while (sitr.tryAdvance((n) -> System.out.print(n + "")))
			;
		System.out.println();

		System.out.println("Using forEachremaining");
		sitr = li.spliterator();
		sitr.forEachRemaining((n) -> System.out.print(n + ""));
		System.out.println();
		System.out.println("Size : " + li.size());
	}

}
