package UserClass;

import java.util.Calendar;

public class User {
	public String firstName, lastName;
	protected int birthYear;
	public User(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public int getAge(){
		return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
	}
}
