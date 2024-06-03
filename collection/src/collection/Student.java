package collection;

import java.util.ArrayList;

public class Student {
	
	String name ;
	int fees ;
	int id;
	//constractor 
	Student(String s,int i,int j){
		
		name =s;
		fees=i;
		id=j;
		//to string () method is overridden to give a meaningful representation of each object
		
	}
	public	String toString() {
			return "|Name :"+name+"|Balance:"+fees+"|ID:"+id+"|\n";
			
			
		}
	public static void main(String[] args) {
		//Array list will contain a collection of Costomer's object
		ArrayList<Student> arr=new ArrayList<Student>(); 
		// creating student object 
		Student obj1=new Student("jack",1001,2);
		Student obj2=new Student("rahul",1002,3);
		Student obj3=new Student("Ravi",1003,4);
		Student obj4=new Student("Chavi",1004,5);
		Student obj5=new Student("shikha",1005,6);
		//Storing object in an ArrayList collection
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		arr.add(obj4);
		arr.add(obj5);
		
		for(Student s:arr)
			System.out.println(s);
	}
	}
	


