package programa.general.dato;

public class PersonRecord {
	private String lastName;
	private String forName;
	private Integer age;

	public PersonRecord() {
		
	}
	public PersonRecord(String lastName, String forName, Integer age) {
		this.lastName = lastName;
		this.forName = forName;
		this.age = age;
	}

	public static Builder builder() {
		return new Builder();
	}
	/*Getters*/
	public String getLastName() {
		return lastName;
	}

	public String getForName() {
		return forName;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "PersonRecord [lastName: " + lastName + ", forName: " + forName + ", age: " + age + "]";
	}

	public static class Builder {
		private String lastName;
		private String forName;
		private Integer age;
	
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder forName(String forName) {
			this.forName = forName;
			return this;
		}
		public Builder age(Integer age) {
			this.age = age;
			return this;
		}
		public PersonRecord build() {
			return new PersonRecord(lastName, forName, age);
		}
	}
}




















