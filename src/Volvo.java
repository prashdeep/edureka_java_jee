
public class Volvo extends Car{
	
	private String securityChecks;
	private String audio;
	
	Volvo(){
		System.out.println("Called from the Volvo default no argument constructor");
	}
	
	public void accelerate(){
		System.out.println("This implementation is volvo specific way of implementing the accleration...");
	}
	
	@Override
	public void applyBrake(){
		System.out.println("Applying the brake specifically designed by Volvo..");
	}
	public static void main(String[] args) {
		Benz benz = new Benz();
		//System.out.println(volvo.tyres);
		//volvo.applyBrake();;
		
		Car newVolvo = new Benz();
		newVolvo.applyBrake();
	}

}
