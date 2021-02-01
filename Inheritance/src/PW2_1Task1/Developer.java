package PW2_1Task1;

public class Developer {
	protected int experience;
	protected final String language;
	public Developer(int experience, String language) {
		this.experience = experience;
		this.language = language;
	}
	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 5;
		return prime * result + experience + ((language == null) ? 0 : language.hashCode());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Developer)) return false;
		Developer other = (Developer)obj;
		if (experience != other.experience) return false;
		if (language == null) {
			if (other.language != null) return false;
		} else if (!language.equals(other.language)) return false;
		return true;
	}
	@Override
	public String toString() {
		return "Developer{experience = " + experience + ", language = " + language + "}";
	}
}
