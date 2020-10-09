
public class FunctionDefinitionTest {
	public static void main(String[] args) {
		FunctionDefinition obj1 = new FunctionDefinition();
		FunctionDefinition obj2 = new FunctionDefinition();
		FunctionDefinition obj3 = new FunctionDefinition();

		obj1.setData(200);

		// obj2.name="dfdsf";
		FunctionDefinition.value = 800;

		System.out.println("Static class level value is >>" + FunctionDefinition.value);
		System.out.println("The value of Obj1.data > " + obj1.data);
		System.out.println("The value of Obj1.name > " + obj1.name);
		System.out.println("The value of Obj1.flag > " + obj1.flag);
		System.out.println("The value of Obj1.value > " + obj1.value);

		System.out.println("The value of obj2.data > " + obj2.data);
		System.out.println("The value of obj2.name > " + obj2.name);
		System.out.println("The value of obj2.flag > " + obj2.flag);
		System.out.println("The value of obj2.value > " + obj2.value);

		System.out.println("The value of obj3.data > " + obj3.data);
		System.out.println("The value of obj3.name > " + obj3.name);
		System.out.println("The value of obj3.flag > " + obj3.flag);
		System.out.println("The value of obj3.value > " + obj3.value);
	}
}
