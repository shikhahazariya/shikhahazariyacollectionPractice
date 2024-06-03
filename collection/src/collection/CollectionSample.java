package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionSample {
	//Main driver method
	public static void main(String args[]) {
		//creating a list
		//declaring a object
		List<String> mylist=new ArrayList();
		//adding ellement
		mylist.add("we");
		mylist.add("love");
		//adding list together
		Collections.addAll(mylist, "papaya","grapes");
		//printing the list contents
		for(int i=0;i<mylist.size();i++)
			System.out.print(mylist.get(i)+"  ");
		
	}

}
