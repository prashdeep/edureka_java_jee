
public class Car extends Object {
	public String color;
	public int make;
	public int tyres;
	public int windows;
	public boolean airBagPresent;
	private String priVariable;
	
	Car(){
      tyres = 4;
      windows = 4;
      System.out.println("Called from the Car default no argument constructor");
	}
	
	Car(String color, boolean airbagRequired){
		this.color = color;
		this.airBagPresent = airbagRequired;
		
	}
	
	Car(String color){
		this.color = color;
		tyres = 4;
	      windows = 4;
	}

	public void accelerate(){
		System.out.println("I am accleration..");
	}
	
	public void applyBrake(){
		System.out.println("Applying the brake..");
	}
}
