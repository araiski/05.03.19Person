package telran.person.data;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private boolean sex;
	
	public Person(int id, String firstName, String lastName, int age,
			boolean sex) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public Person(String firstName, String lastName, int age, boolean sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}

	
	