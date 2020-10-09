
public class FunctionDefinition {

	int data;
	String name;
	boolean flag;
	static int value;

	public void setData(int data) {
		this.data = data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printName(String n) {
		System.out.println("The name is " + name);
	}
}
