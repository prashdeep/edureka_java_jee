
public class StringExamples {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str2 = new StringBuffer("Hello");

		StringBuffer str3 = str.append(str2);

		System.out.println(str);
		System.out.println(str2);

		// System.out.println(str+str2);
		// System.out.println(str.length());
		// System.out.println(str.charAt(2));
		// System.out.println(str.equalsIgnoreCase("hello"));
		// System.out.println(str.indexOf('l'));

		System.out.println(str3.toString());
		
		

	}
}
