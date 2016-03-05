
public class stringDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.replace('l', 'm');

		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		sb.append("OneMoreString");
		System.out.println(sb.toString());
	}
}
