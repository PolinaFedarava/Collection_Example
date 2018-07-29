package by.htp.collection.entity;

public class User implements Comparable<User>{

	private int age;
	private String name;
	
	
	
	public User(int age, String name ) {
		super();
		this.age = age;
		this.name = name;
	}

	public User() {
		super();
	
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "age=" + age  + "name=" + name ;
	}

	@Override
	public int compareTo(User user) {
		int result = this.name.compareTo(user.name);
		if (result== 0)
		{
			return this.age - user.getAge() ;
		}
		return result ;
	}
	
	

	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (age != other.age)
//			return false;
//		return true;
//	}
	
	
	
	

}
