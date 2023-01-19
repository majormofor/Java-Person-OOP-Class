package personClass;

public class main {

	public static void main(String[] args) {

		// Getting person full details
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("smith");
		person.setAge(17);
		person.setEmail("JohnSmith@gmail.com");
		person.setContactNumber("074847672");
		System.out.println(person.getFullDetail());

		// Getting person2 full details with missing last name
		Person person2 = new Person();
		person2.setFirstName("Peter");
		person2.setLastName("");
		person2.setAge(60);
		person2.setEmail("petermike@gmail.com");
		person2.setContactNumber("07847382");
		System.out.println(person2.getFullDetail());
	}

}
