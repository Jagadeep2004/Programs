package CollectionExamples;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Double> map = new TreeMap<String, Double>();
		System.out.println("Size : " + map.size());
		map.put("A", 234.44);
		map.put("C", 676.4);
		map.put("H", 598.4);
		map.put("O", 143.55);
		map.put("B", 254.54);
		System.out.println("Elements : " + map);
		System.out.println("Size : " + map.size());
		Set<Map.Entry<String, Double>> set = map.entrySet();
		
		for(Map.Entry<String,Double>me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
