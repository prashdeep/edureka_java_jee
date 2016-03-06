import com.edureka.java_jee.module_4.ICalculator;
import com.edureka.java_jee.module_4.ImplementationOne;

public class InterfaceRun {

	public static void main(String[] args) {
		ICalculator calculator = new ImplementationOne();

		System.out.println(calculator.add(6, 4));

	}

}
