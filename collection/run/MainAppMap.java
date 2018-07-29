package by.htp.collection.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.htp.collection.entity.User;

public class MainAppMap {

	public static void main(String[] args) 
	{
		List <User> users1 = new ArrayList<>();
		users1.add(new User (20, "Kate"));
		users1.add(new User (21, "Olga"));
		users1.add(new User (20, "Mary"));
		
		List <User> users2 = new ArrayList<>();
		users2.add(new User (18, "Petr"));
		users2.add(new User (24, "Igor"));
		users2.add(new User (20, "Ivan"));
		
		Map<Integer, List<User>> map = new HashMap <> ();
		map.put(1, users1);
		map.put(2, users2);
		map.put(1, users2);
		
		System.out.println(map);
		
		for (User user: users1)
		{
			System.out.println(map);
		}
		
//		for (User user: users2)
//		{
//			System.out.println(map);
//		}
		
		System.out.println();
		

	}

}
