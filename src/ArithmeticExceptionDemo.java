public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		String name  = "Pradeep";
		try{
		System.out.println(name.length());
		}catch(NullPointerException e){
			System.out.println("Please enter a valid name ");
			return;
		}catch(Exception ex){
			System.out.println("Caught the broder exception.");
		}
		System.out.println("After the null pointer exception is reported ..");
	}

}
