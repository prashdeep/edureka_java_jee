
public class Person {
	
	Person (String name, int age, String occupation){
		new Person(name, age, null, occupation);
	}
	
	Person (String nme, int age, String sex, String occupation){
		name = nme;
		this.age = age;
		this.occupation = occupation;
		this.sex = sex;
	}
	
	Person (String name ,int age){
		this.name = name;
		this.age = age;
	}
	


	// default values
	// String/Object - null;
	// int  - 0;
	// boolean - false
	// long = 0
	// double/float - 0.0
	String name;
	String sex;
	int age;
	String occupation;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSex() {
		return sex;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getOccupation() {
		return occupation;
	}

	void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
