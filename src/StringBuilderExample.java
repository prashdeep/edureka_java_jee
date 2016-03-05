
public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("India > ");
		System.out.println("string = " + str);

		// appends the string argument to the StringBuilder
		str.append(" Karnataka");
		// print the StringBuilder after appending
		System.out.println("After append = " + str);

		String str1 = "India > ";
		String str2 = str1.concat("Bangalore ");

		System.out.println(str1);
		System.out.println(str2);

	}
}
