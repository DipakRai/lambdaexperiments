package mulshankar13.microfocus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");

		List<Entry<Integer, String>> entryList = new ArrayList<Entry<Integer, String>>(map.entrySet());

		for (Entry<Integer, String> s : entryList) {
			System.out.println(s);
		}

//		List<String> result = createListFromMapEntries(map);
//		result.forEach(System.out::println);
	}

	private static <K, V> List<V> createListFromMapEntries(Map<K, V> map) {
		return map.values().stream().collect(Collectors.toList());
	}

}
