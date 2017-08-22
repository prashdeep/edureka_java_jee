
public class CharDemo {
	
	public static void main(String[] args) {
		String str = "hello world";
		String str2 = new String("Hello ");
		String str3 = new String("Students ");
		//System.out.println(str.length());
		System.out.println(str.contains("hellos"));
		//System.out.println(str2+str3+" Welcome to Edureka course on Java JEE.");
		
		String one= "hello";
		String two = one+"world";
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("edureaka");
		System.out.println(sb.toString());
		
		
	}

}
