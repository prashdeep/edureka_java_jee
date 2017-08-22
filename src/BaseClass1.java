import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class BaseClass1 implements Serializable{
	
	public void method1(){
		@SuppressWarnings("rawtypes")
		List myList = new ArrayList();
		
	}

}

class SubClass1 extends BaseClass1{
	
	@Override
	public void method1(){
		
		
	}
}
