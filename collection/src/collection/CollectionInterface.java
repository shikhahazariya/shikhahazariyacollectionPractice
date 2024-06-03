package collection;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionInterface {
	public static void main(String args []) {
		//creating a empty linked list
		Collection<String> mylist=new LinkedList();
		//use add method to add element in list
		mylist.add("we");
		mylist.add("are");
		mylist.add("indians");
		//output the present list
		System.out.println("the list is :" +mylist);
		
	}

}
