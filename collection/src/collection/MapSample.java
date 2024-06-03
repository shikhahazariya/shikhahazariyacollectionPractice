package collection;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) {
		
	
// creating an empty HashMap
	Map<String,Integer> mymap=new HashMap<String,Integer>();
	
	//inserting pairs in above Map
	// using put() method
	mymap.put("a", new Integer(100));
	mymap.put("b", new Integer (200));
	mymap.put("c", new Integer(300));
	mymap.put("d", new Integer(400));
     
	//Traversing through Map through for each loop
	for(Map.Entry<String, Integer>mp:mymap.entrySet()) {
		// Printing Keys
		
		System.out.print(mp.getKey()+ ":");
		System.out.println(mp.getValue());
	}
	}
}
