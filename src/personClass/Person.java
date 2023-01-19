package personClass;

public class Person {
	// write your code here

	private String firstName;
	private String lastName;
	private int age;

	private String email;

	private String contactNumber;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {

		if ((age < 0) || (age > 100)) {
			this.age = 0;
		} else {

			this.age = age;

		}

	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTeen() {
		if ((age > 12) && (age < 20)) {
			return true;
		} else {
			return false;
		}

	}

	public String getFullName() {
		if (firstName.isEmpty() && lastName.isEmpty()) {
			return "";

		} else if (lastName.isEmpty()) {
			return firstName;

		} else if (firstName.isEmpty()) {
			return lastName;

		} else {
			return firstName + " " + lastName;
		}

	}

	public String getFullDetail() {
		String st = "";

		st += "FullName: " + getFullName() + "\n";

		st += "Age: " + age + " years old" + "\n";

		st += "Email: " + email + "\n";

		st += "Phone number " + contactNumber + "\n";

		st += "Are you a teen? (true/false) - " + isTeen() + "\n";

		return st;
	}
}