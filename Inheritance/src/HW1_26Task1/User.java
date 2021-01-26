package HW1_26Task1;

import java.util.Calendar;

public class User {
	protected String name;
	protected String surname;
	protected int birthYear;
	public User(String name, String surname, int birthYear){
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	protected int getAge(){
		return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
	}
	@Override
	public String toString(){
		return this.name+" "+this.surname+", "+getAge();
	}
	@Override
	public boolean equals(Object obj) {
		User other = (User)obj;
		return this.name.equals(other.name) && this.surname.equals(other.surname);
	}
}
