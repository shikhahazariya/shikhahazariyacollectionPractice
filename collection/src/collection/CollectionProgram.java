package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProgram {
	
	public static void main(String[] args) {
		//creating arrayList
		ArrayList<String>mylist=new ArrayList<String>();
		mylist.add("Lion");//Adding object in arraylist
		mylist.add("tiger");
		mylist.add("leapord");
		mylist.add("rabbit");
		mylist.add("rat");
		//traversing the list through
		Iterator itr=mylist.iterator();
		System.out.println("The element are");
		while(itr.hasNext()) {
			
			//chek if iterator has the elements
			System.out.println(itr.next());
		}
	}

}
