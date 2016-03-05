
public class Benz extends Car {

	public void accelerate() {

		System.out.println("This implementation is BENZ specific way of implementing the accleration... ");
	}

	@Override
	public void applyBrake() {
		System.out.println("Applying the brake specifically designed by BENZ..");
	}
}
