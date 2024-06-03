package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionAlgoSample {
	
	public static void main(String[] args) {
		
		List<String>mylist=new ArrayList<>();
		mylist.add("java");
		mylist.add("R");
		mylist.add("css");
		mylist.add("XML");
		System.out.println("List:"+mylist);
		//Uses List.sort() method with a Comparator

	mylist.sort(Comparator.comparing(String::length));
	System.out.println("Sorted List :"+ mylist);
	}

}
