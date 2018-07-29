package by.htp.collection.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) 
	{
		Collection collection = null; 
		
		List <String> list = new ArrayList<> (); 
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		ArrayList <String> list1 = new ArrayList<> (100); 
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		
		
		List<String> list2 = new LinkedList<> ();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		
		LinkedList <String> list3 = new LinkedList<> ();
		list3.add("one");
		list3.add("two");
		list3.add("three");
		
		//System.out.println(list3.getFirst());
		
		Deque<String> list4 = new LinkedList<>();
		list4.add("one");
		list4.add("two");
		list4.add("three");
		list4.add("four");
		list4.add("five");
		System.out.println(list4.pop());
		System.out.println(list4.peek());
		System.out.println(list4.offer("offer"));
		System.out.println(list4.poll());
		
		
		
//		for (int i = 0; i< list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		for (String str: list)
//		{
//			System.out.println(str);
//		}
		
		Queue queue;
		
		Set set; 
		
		
		
	}

}
