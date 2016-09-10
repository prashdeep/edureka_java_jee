
class PersonExample {
	public String name;

	public void setName(String name) {
		this.name = name;
	}

}

public class CallByReference {

	public static void main(String[] args) {
		PersonExample person = new PersonExample();

		System.out.println("Before calling the set Name " + person.name);
		person.setName("Pradeep");
		System.out.println("After calling the set Name " + person.name);
	}

}
