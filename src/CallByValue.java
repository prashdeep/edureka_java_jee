
public class CallByValue {

	public static void main(String[] args) {
	
		String name = "Pradeep ";
		String modifiedName = setName(name);
		
		System.out.println("The value of a from the main method "+name);
		System.out.println("The value of b from the main method "+modifiedName);
	}
	
	
	
	private static String setName(String name){
		name = name.concat("Kumar");
		System.out.println("The value of name is "+name);
		return name;
	}

}
