
public class ArgumentAccept {

	public static void main(String[] args) {
		System.out.println("Length > " + args.length);
		int finalValue = 0;
		for (String arg : args) {
			try {
				finalValue = finalValue + Integer.parseInt(arg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Final value is > " + finalValue);
		}
	}

}
