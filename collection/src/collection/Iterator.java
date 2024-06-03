package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
	public static void main(String[] args) {
		
		//Creating an array list object
		//Declaring object of Integer type 
		ArrayList<Integer> arr=new ArrayList<Integer>();
		// Iterating over the list
		for(int i=0;i<10;i++)
			arr.add(i);
		
		// Print the object in the list
		
		System.out.println(arr);
		// at the beginning itr(cursor) will point to
		//index just before the first element in the list
		Iterator itr = new Iterator();
		//checking the next element where
		//condition holds true till there single element
		//in the list using hasnext() method 
		while ( itr.hasNext()) {
			// moving cursor to the next element
			int i=(Integer)( itr.next());
			System.out.println(i+"");
		}
		//command for next  line 
		System.out.println();
		//printing the element inside the object
		System.out.println(arr);
	}

	private Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
