import java.io.Serializable;
import java.util.Date;

class BaseClass {

	public void method1(String str,  int i) {
		System.out.println("Called from super class");
	}

	@Deprecated
	public void method2() {
		System.out.println("called from method 2");
	}
}

class SubClass extends BaseClass {

	@Override
	public void method1(String str, int i) {
		// TODO Auto-generated method stub
		super.method1(str, i);
	}
	
	

}

@SuppressWarnings("serial")
public class AnnotationDemo implements Serializable {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		BaseClass obj = new SubClass();
		obj.method2();
		Date date = new Date();
		date.getYear();
		
	}
}
