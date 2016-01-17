
public class MyCar {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Car mylueCar = new Car("Blue");
		Car myRedCar = new Car("Red", true);
		
		System.out.println("Color > "+myRedCar.color);
		System.out.println("tyres > "+myRedCar.tyres);
		System.out.println("windows > "+myRedCar.windows);
		System.out.println("Air bag present > "+myRedCar.airBagPresent);
	}

}
