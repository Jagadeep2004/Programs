package CollectionExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		System.out.println("Size : " + map.size());
		map.put(5, 234.44);
		map.put(6, 676.4);
		map.put(8, 598.4);
		map.put(2, 143.55);
		map.put(3, 254.54);
		System.out.println("Elements : " + map);
		System.out.println("Size : " + map.size());
		Set<Map.Entry<Integer, Double>> set = map.entrySet();
		
		for(Map.Entry<Integer,Double>me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
