
public class StringDemoExample {

	public static void main(String[] args) {
		StringBuffer s1 = new  StringBuffer("Pradeep");
		
		String s3 = new String("Pradeep");
		String s4 = "Pradeep";
		
		StringBuffer s2 = s1.append("Kumar");
		System.out.println(s1 == s2);
		System.out.println(s2);
		System.out.println(s1.toString());
		
		//System.out.println("Length >> "+s1.length());
		
		 
		 
		// System.out.println(s1==s4);
		 //System.out.println(s1==s3);
		 //System.out.println(s3==s4);
	}
}
