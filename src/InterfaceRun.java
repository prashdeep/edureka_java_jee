import com.edureka.java_jee.module_4.ICalculator;
import com.edureka.java_jee.module_4.Impl1;

public class InterfaceRun {

	public static void main(String[] args) {
		ICalculator calculator = new Impl1();

		System.out.println(calculator.add(6, 4));

	}

}
