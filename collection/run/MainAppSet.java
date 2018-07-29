package by.htp.collection.run;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import by.htp.collection.entity.User;
import by.htp.collection.entity.UserComparator;

public class MainAppSet {

	public static void main(String[] args) {
		
		Set <String> set = new HashSet<> ();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("three");
		set.add("one");
		set.add(null);
		set.add(null);
		System.out.println();
		
		Set<User> set2 = new HashSet<>();
		set2.add(new User(20, "Vasil"));
		set2.add(new User(20, "Vasil"));
		
		set2.add(new User(21, "Olga"));
		set2.add(new User(21, "Kate"));
		
		set2.add(new User(22, "Petr"));
		
		System.out.println();
		
		Set <String> set3 = new LinkedHashSet<> ();
		set3.add("one");
		set3.add("two");
		set3.add("three");
		set3.add("four");
		set3.add("five");
		set3.add("three");
		set3.add("one");
		
		System.out.println();
		
		Set<String> set4 = new TreeSet <>();
		set4.add("one");
		set4.add("two");
		set4.add("three");
		set4.add("four");
		set4.add("five");
		 
		System.out.println();
		
		Set<User> set5 = new TreeSet <>(new UserComparator());
		set5.add(new User(20, "Vasil"));
		set5.add(new User(20, "Kate"));	
		set5.add(new User(21, "Olga"));
		set5.add(new User(21, "Kate"));
		set5.add(new User(19, "Petr"));
		
		for (User user: set5)
		{
		//	System.out.println(user);
		}
		 
		Set<User> set6 = new TreeSet <>
		(
				new Comparator <User>()
				{
					@Override
					public int compare(User u1, User u2) 
					{
						return u1.compareTo(u2);
				    }
			
				}
		);
		set6.add(new User(20, "Vasil"));
		set6.add(new User(20, "Kate"));	
		set6.add(new User(21, "Olga"));
		set6.add(new User(21, "Kate"));
		set6.add(new User(19, "Petr"));
		for (User user: set6)
		{
			System.out.println(user);
		}
		System.out.println();
		

	}

}
