
public class Person {
	
	private String name;
	private String sex;
	private int age;
	private String occupation;
	
	
	private boolean permanent;
	
	Person(){
		permanent = true;
		sex = "Male";
		System.out.println("This is called when new person is called..");
	}
	
	
	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation(){
		return this.occupation;
	}

}
