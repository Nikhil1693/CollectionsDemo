package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		Map<String,Integer> map=new TreeMap<>();
		
		map.put("nikhil", 26);
		map.put("Ajay", 27);
		map.put("push", 28);
		
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}

}
