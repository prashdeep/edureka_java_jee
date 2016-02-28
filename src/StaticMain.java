
public class StaticMain {

	public static void main(String[] args) {
		StaticDemo st1 = new StaticDemo();
		System.out.println("The initial value of counter is " + StaticDemo.getCounterValue());
		System.out.println("The initial value of count is " + st1.getCount());
		StaticDemo st2 = new StaticDemo();

		System.out.println("The next value of counter is " + StaticDemo.getCounterValue());
		System.out.println("The next value of count is " + st1.getCount());

		StaticDemo st3 = new StaticDemo();

		System.out.println("The third time value of counter is " + StaticDemo.getCounterValue());
		System.out.println("The third time value of count is " + st3.getCount());

	}

}
