package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class GenericSample {
	public static void main(String args[]) {
		Map<Integer,String>mymap=new HashMap<Integer,String>();
		mymap.put(1, "shikha");
		mymap.put(4, "Omar");
		//now use Map.Entry for set and Iterator
		Set<Map.Entry<Integer,String>>myset=mymap.entrySet();
		
	Iterator<Entry<Integer, String>> myitr=myset.iterator();
	while(myitr.hasNext()) {
		Map.Entry mye=myitr.next();// no need to type cast
		System.out.println(mye.getKey()+ " "+ mye.getValue());
	}
	}

}
