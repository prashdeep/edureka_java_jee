
public class PersonTest {
	
	public static void main(String[] args) {
		Person kiran = new Person("Kiran",34, "Male", "Teacher");
		Person naveen = new Person("Naveen", 22, "Male", "Athlete");

		
		System.out.println(kiran.getName());
		System.out.println(kiran.getAge());


		System.out.println(naveen.getName());
		System.out.println(naveen.getAge());
		System.out.println(naveen.getOccupation());
	}

}
